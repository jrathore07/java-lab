/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//shape//
class Shape{
   
public void area()
    {
        System.out.println("area of shaps is");	
    }
}
class Circle extends Shape {
    public void area(int r){
        
       
        System.out.println("area of the circle " + 3.14*r*r);
    }
    
        
    
}
class Rect extends Shape{
     public void area(int a,int b)
     {
      
          System.out.println("area of the rectangle "+a*b);
     }
    
    
}
public class MethodoverwritingEx2{
	public static void main(String[] args) {
	     Shape a=new Shape();
	     Circle b=new Circle();
	     Rect c=new Rect();
	     a.area();
	     b.area(4);
	     c.area(12,11);
	}
	
}

