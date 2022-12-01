
class MultiFunctionMachine implements MultiFunctionDevice
{
  // compose this out of several modules
  private Printer printer;
  private IScanner scanner;
  private FaxMachine faxer;
  public MultiFunctionMachine(Printer printer, IScanner scanner, FaxMachine faxer)
  {
    this.printer = printer;
    this.scanner = scanner;
    this.faxer = faxer;
  }

  public void print(Document d) throws Exception
  {
    printer.print(d);
  }

  public void scan(Document d) throws Exception
  {
    scanner.scan(d);
  }

@Override
public void fax(Document d) throws Exception {
	
	faxer.fax(d);
	
}
}

public class TestInterfaceSegregationPrinciple {

	public static void main(String[] args) {
		
		
		
		// MultiFunctionMachine mm = new  MultiFunctionMachine( );

	}

}
