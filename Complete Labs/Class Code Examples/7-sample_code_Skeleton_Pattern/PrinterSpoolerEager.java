class PrinterSpoolerEager{

	private int printer;
	private static PrinterSpoolerEager instance = new PrinterSpoolerEager();
	// eagerly loads the singleton ^

    private PrinterSpoolerEager(){
        this.printer = 0;
    }   

    public static PrinterSpoolerEager getPrinterSpoolerEager(){
        return instance;
    }
}

