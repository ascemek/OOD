package strategypattern;


public class MysteriousTextProcessor<T extends StringProcessorInterface>
{
	private T myStringProcessor; 
	//composition, MysteriousTextProcessor has-A StringProcessorInterface
	
	public MysteriousTextProcessor(T strx)
	{
		myStringProcessor = strx;
	}

	public void run()
	{
		System.out.println("I am " + this.getClass().getSimpleName());
		System.out.println("I am working with " + myStringProcessor.getClass().getSimpleName() + " class...");
		System.out.println("\nPlease provide some input: ");
		myStringProcessor.run();
		System.out.println("Mysterious Process ends :)\n");
		
	}

	public void resetAlgo(T strx)
	{
		myStringProcessor = strx;
	}
	
}
