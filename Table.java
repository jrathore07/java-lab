//jaydeep rathore
//0827CI221071
import java.util.Scanner;
public class Table{
    public static void main(String[]args)
    {
        Scanner r=new Scanner(System.in);
         System.out.println("enter the number:- ");
        int n=r.nextInt();
        int t;
        for(int i=1;i<=10;i++)
        {
        System.out.println(n+"*"+i+"="+n*i);
        }
        
    }
}