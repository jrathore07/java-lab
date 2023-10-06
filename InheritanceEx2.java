/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Animal{
    public int LegCount;
public void display()
    {
        	System.out.println("i am an Animal");
        	System.out.println("i have"+LegCount+"legs.");
    }
}

public class InheritanceEx2{
	public static void main(String[] args) {
	     Animal animal =new Animal();
	     animal.LegCount=4;
	    
	    animal.display();
		
	}
}

