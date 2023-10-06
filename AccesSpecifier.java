/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Data{
    private String name;
    public void set(String s)
    {
        name=s;
    }
    public void get()
    {
        System.out.println(name);
    }
}
public class AccesSpecifier
{
	public static void main(String[] args) {
		Data d=new Data();
		d.set("dev");
		d.get();
	}
}