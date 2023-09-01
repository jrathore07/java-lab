//jaydeep rathore
//0827CI221071
import java.util.Scanner;
public class Fact{
    public static void main(String[]args)
    {
        Scanner r=new Scanner(System.in);
         System.out.println("enter the number:- ");
        int n=r.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("factorial of number is:- "+fact);
    }
}