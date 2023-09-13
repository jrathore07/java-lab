//convert the string from lower case to upper case or vicevers
import java.util.Scanner;
public class RollnoString
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter name");
	    String name=sc.nextLine();
	    System.out.println("enter enroll");
	    
	    String En=sc.nextLine();
	    int year=sc.nextInt();
	    System.out.println("enter year");
		String y=String.valueOf(year);
	
		 System.out.println(name+y+En+"@acropolis.in");
		
		
		
		
		
	}
}
