//Exception handling//
import java.util.Scanner;
public class Multicatch2
{
	public static void main(String[] args) {
	    String s=null;
	    int a[]={10,20,30};
	    try{
	  
	   
	    //System.out.println(s.Length());
	     System.out.println(a[3]);
	   
	    }
	    
	    catch(ArrayIndexOutOfBoundsException Al)
	    {
	       System.out.println("Exception index out of bound "+Al);
	    }
	    catch(NullPointerException A2)
	    {
	       System.out.println("Exception Null point of Exception "+A2);
	    }
	    
	    
	}
}
