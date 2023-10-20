
public class ThrowEx2
{
    public static void checkNum(String s){
        if(s==null){
            throw new NullPointerException("\nNumber is negative ,cannot calculate square");
        }
        else{
            	
        }
        
            
    }
	public static void main(String[] args) {
	    
	    checkNum(null);
	    
		System.out.println("rest of code");
	}
}
