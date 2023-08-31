/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Calc{
   private int a;
   private int b;
    Calc(int i,int j)
    {
        a=i;
        b=j;
    }
    public void add()
    {
        int A =a+b;
        System.out.println("Add is" + A);
        
    }
     public void sub()
    {
        int S =a-b;
        System.out.println("sub is" + S);
        
    }
     public void multiply()
    {
        int M =a*b;
        System.out.println("multiply is" + M);
        
    }
     public void divide()
    {
        int D =a/b;
        System.out.println("divide is" + D);
        
    }
    public static void main(String[]args)
    {
        Calc c1=new Calc(11,12);
        c1.add();
        c1.multiply();
        c1.sub();
        c1.divide();
    }
}
