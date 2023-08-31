//jaydeep rathore
//0827CI221071
import java.util.Scanner;
public class Sum{
     public static void main(String[] args) {
	    
	    Scanner r = new Scanner(System.in);
	    System.out.println( "enter the number :- ");
	    int n=r.nextInt();
	    int sum=0;
	    for(int i=1;i<=n;i++)
	    {
	        sum+=i;
	        
	        
	    }
	    System.out.println("sum of natural no.is :- " +sum);
     }
}
