
class parent
{
    void display(){
        	System.out.println("this is a parent class");
        
    }
    void show(int n){
        	System.out.println("the number is parent class is "+n);
    }
}
class child extends parent
{
    void display(){
        	System.out.println("this is a child class");
        
    }
    void show(double n){
        	System.out.println("the number is child class is "+n);
    }
}
public class MethodeOverwritingEx2 extends parent{
    public static void main(String[] args){
        parent p=new parent();
        child c=new child();
        c.show(8);
        c.show(9.4);
        p.display();
        c.display();
    }
    
    
}
