//constructor chaning


 public class Constructorchaning {
     int sum;
     Constructorchaning(){
         this(1,8);
     }
      Constructorchaning(int i,int j){
          this.sum=i+j;
      }
      public void display(){
          System.out.println("sum "+sum);
      }public static void main(String[]args){
          Constructorchaning a=new Constructorchaning();
          a.display();
      }
        
        }
        
    