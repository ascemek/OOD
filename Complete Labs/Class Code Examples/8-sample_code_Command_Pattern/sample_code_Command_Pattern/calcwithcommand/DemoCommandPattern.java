package calcwithcommand;
import calcwithoutcommand.Calculator;

public class DemoCommandPattern{

	public static void main(String[] args) {
		
		
		// we are creating a calculator object.
		Calculator cX = new Calculator(10.5);
		System.out.println(cX);
		
		
		// we want to pass three commands in the calculator. So we are creating three
		// different command objects.
		
		Command a = new AddCommand(cX, 10.0);
		Command b = new SubCommand(cX, 110.9);
		Command c = new MultCommand(cX, -10.0);
		/*
		a.execute();
		b.execute();
		c.execute();
		
		*/
		 //TODO>> Now uncomment the following three lines and note the differences
		 
		/*
		 c.undo();
		 b.undo();
		 a.undo();
		 */
		
		/*
		 * Issue: The client may not know of the exact methods but still
		 * the client is responsible for taking care of the whole execution process 
		 * 
		 * Can we do anything more for the client?
		 * 
		 */
		
		/*
		CommandInvoker cvk = new CommandInvoker();
		cvk.addCommand(a);
		cvk.addCommand(b);
		cvk.addCommand(c);
		
		System.out.println("Before adding: " + cX.getValue());
		cvk.executeCommand();
		System.out.println( "\t After completing the executions: " + cX.getValue());
		cvk.undoCommand();
		System.out.println("\t\tAfter undoing all the executions: " + cX.getValue());
		*/
	}

}


/*
 * TODO 1: Write a class DivideCommand to carry out the Division operation
 * 		 Carefully think about the undo operation.
 * 
 * TODO 2: State one down side of the command pattern. 
 * 
 * Post your answers on the discussion board.
 */
