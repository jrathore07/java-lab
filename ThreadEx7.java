public class ThreadEx7 implements Runnable
{
    public void run(){
        try{
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println("Exception "+e);
        }
        System.out.println("run methode");
    }
    public static void main(String[]args){
        for(int i=0;i<10;i++){
            Thread t=new Thread (new ThreadEx7());
            t.start();}
    }
}