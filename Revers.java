//jaydeep rathore 
//0827CI21071
import java.util.Scanner;
public class Revers
{
	public static void main(String[] args) {
	    Scanner r=new Scanner(System.in);
		System.out.println("enter the number:- ");
		int n=r.nextInt();
		int rev=0;
		int a;
		while(n!=0)
		{
		a=n%10;
		rev=rev*10+a;
		n/=10;
		}
		System.out.println("revers of the number is:- "+rev);
		
	}
}
