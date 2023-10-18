//Exception handling//
import java.util.Scanner;
public class ErrorChecking1
{
	public static void main(String[] args) {
	   
	    try{
	  int x=10;
	  int y=0;
	  int z=x/y;
	   
	    System.out.println(z);
	    
	   
	    }
	    
	    catch(Throwable err)
	    {
	       System.out.println("Exception "+err.getMessage());
	    }
	   
	    
	}
}
