//convert the string from lower case to upper case or vicevers
import java.util.Scanner;
public class ChangeCase
{
	public static void main(String[] args) {
		
		System.out.println("enter String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("enter choice 0 for lowr case,1 for upper case");
		int i=sc.nextInt();
		switch(i)
		{
		  case 0:
		      {
		    	System.out.println(s.toLowerCase());
		    break;
		      }
		 case 1:
		     {
		    System.out.println(s.toUpperCase());
		    break;
		     }
		 default:
		 {
		   System.out.println("invalid case");
		 }     
		}
		
		
		
	}
}
