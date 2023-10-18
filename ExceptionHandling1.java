//Exception handling//

public class ExceptionHandling1
{
	public static void main(String[] args) {
	    try{
	    int divideByZero=5/0;
	   
		  System.out.println("rest of code in try block");
	    }
	    catch(ArithmeticException E)
	    {
	       System.out.println("Arithmetic Exception=>"+E.getMessage());
	    }
	}
}
