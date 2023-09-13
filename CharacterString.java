//compare two string
import java.util.Scanner;
public class CharacterString
{
	public static void main(String[] args) {
	    String a="hello";
	    int v=0,c=0;
	    boolean per =false;
	    for(int i=0;i<a.length();i++)
	    {
	        if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
	        {
	        c++;
	        }
	    else{
	        v++;
	    }
	    }
	
	    System.out.println(c + " " +v);
	
		
		
		
		
		
		
	}
}
