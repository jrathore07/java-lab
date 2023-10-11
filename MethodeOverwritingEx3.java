
class Animal
{
    public void eat(){
        	System.out.println("this is a animal class");
        
    }
    
}
class Dog extends Animal
{
   public void eat(){
        	System.out.println("this is a dog class");
        
    }
    public void bark(){
        super.eat();
        	System.out.println("bhav......");
        
    }
    
}
public class MethodeOverwritingEx3 {
    public static void main(String[] args){
        Animal a=new Animal();
        Dog d=new Dog();
        a.eat();
        d.eat();
        d.bark();
     
    }
    
    
}
