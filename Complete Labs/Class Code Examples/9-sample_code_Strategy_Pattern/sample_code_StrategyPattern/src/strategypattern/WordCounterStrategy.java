package strategypattern;

class WordCounterStrategy implements StringProcessorInterface
{

	@Override
	public String process(String t) {
		
		int words = t.split(" ").length;
		return "The string: \'" + t + "\' has " + words + " words in it.";
	}
	
}