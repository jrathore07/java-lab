
 interface solution{
    public void Hello();
    public void Welcome();
}
public class A implements solution{
    public void Hello(){
       System.out.println("Hello World");
    }

public void Welcome(){
    System.out.println("Welcome to india");
}

	public static void main(String[] args) {
		A a=new A();
		a.Hello();
		a.Welcome();
	}
}
