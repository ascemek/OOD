package strategypattern;



public class DemoStrategyPattern {

	public static void main(String[] args) {
		
		//test 1
		MysteriousTextProcessor mst = new MysteriousTextProcessor(new WordCounterStrategy());
		mst.run();
		mst.resetAlgo(new FindLongestStrategy());
		mst.run();
		
		mst.resetAlgo(new FindOddStrategy());
		mst.run();
		/*
		//test 2
	    MysteriousTextProcessor mst2 = new MysteriousTextProcessor(new FindLongestStrategy());
	    mst2.run();
		
	  //test 3
	    MysteriousTextProcessor mst3 = new MysteriousTextProcessor(new FindOddStrategy());
	    mst3.run();
		*/
	}
	
}
