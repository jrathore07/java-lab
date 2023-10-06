/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//to demonstrate method overiding and inharitance//
class Animal{
   
public void Eat()
    {
        System.out.println("eat in parent class");	
    }
}
class Dog extends Animal {
    public void Eat(){
        System.out.println("eat in subclass");
    }
    public void Bark(){
        System.out.println("bhav......");
        
    }
}
public class MethodOverwriting{
	public static void main(String[] args) {
	     Animal a=new Animal();
	    
	    a.Eat();
	    Dog d=new Dog();
	    d.Eat();
	    Animal c= new Dog();
	    c.Eat();
	   Dog b=new Dog();
	   b.Bark();
		
	}
	
}

