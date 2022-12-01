class PrinterSpoolerLazy{

	private int printer;
  	private static PrinterSpoolerLazy instance;
 
	private PrinterSpoolerLazy() {
		this.printer = 0;
    }
 
	// lazy loads the singleton
    public static PrinterSpoolerLazy getPrinterSpoolerLazy(){
        if (instance == null) {
            instance = new PrinterSpoolerLazy();
        }
	return instance;
    }
}

