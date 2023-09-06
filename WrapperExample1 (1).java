//jaydeep rathore
//0827CI221071
//wrapper class(example)
//un boxing
public class WrapperExample1{
    public static void main(String args[])
    {
        Integer a=new Integer(3);
        int i=a.intValue();
        int j=a;
        System.out.println(a+" "+i+" "+j);
        Character c=new Character('c');
        char C=c.charValue();
        char k=c;
        System.out.println(c+" "+C+" "+k);
        Float f=new Float(1.2);
        float F=f.floatValue();
        float m=f;
         System.out.println(f+" "+F+" "+m);
         Long l=new Long(35647);
        long L=l.longValue();
        long q=l;
        System.out.println(l+" "+L+" "+q);
        Double d=new Double(3345.43);
        double D=d.doubleValue();
        double s=d;
        System.out.println(d+" "+D+" "+s);
         
        
        
        
    }
}