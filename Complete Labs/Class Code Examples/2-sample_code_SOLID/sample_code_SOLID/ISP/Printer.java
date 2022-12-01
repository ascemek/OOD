
class Document
{
}


interface Machine
{
  void print(Document d);
  void fax(Document d) throws Exception;
  void scan(Document d) throws Exception;
}


class MultiFunctionPrinter implements Machine
{
  public void print(Document d){
    //
  }

  public void fax(Document d){
    //
  }

  public void scan(Document d){
    //
  }
}



class OldFashionedPrinter implements Machine
{
  public void print(Document d) {
    // yep
  }

  public void fax(Document d) throws Exception
  {
    throw new Exception();
  }

  public void scan(Document d) throws Exception
  {
    throw new Exception();
  }
}

interface Printer
{
   void print(Document d) throws Exception;
}

interface IScanner
{
  void scan(Document d) throws Exception;
}

interface FaxMachine
{
   void fax(Document d) throws Exception;

}

class JustAPrinter implements Printer
{
  public void print(Document d)
  {

  }
}

class Photocopier implements Printer, IScanner
{
  public void print(Document d) throws Exception
  {
    throw new Exception();
  }

  public void scan(Document d) throws Exception
  {
    throw new Exception();
  }
}

interface MultiFunctionDevice extends Printer, IScanner, FaxMachine
{

}

