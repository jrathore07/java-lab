 class Automobile
{
    public void start(){
        System.out.println("engine start runnig");
    }
    public void stop(){
        System.out.println("engine stops runnig");
    }
    public void seatings(){}
}
class Car extends Automobile{
     public void no_of_tyres(){
        System.out.println("there are 4 tyres");
    }
     public void fuel(){
        System.out.println("petrol");
    }
     public void fuel(String fuel){
        System.out.println("Also runs on diesel");
    }
     public void seating(){
        System.out.println("4 seating");
    }
    
}
class Bike extends Automobile{
     public void no_of_tyres(){
        System.out.println("there are 2 tyres");
    }
     public void fuel(){
        System.out.println("petrol");
    }
     public void seating(){
        System.out.println("2 seating");
    }
}
public class Overriding2{
    

	public static void main(String[] args) {
		Automobile a=new Automobile();
        a.start();
        a.stop();
        Car c=new Car();
        c.no_of_tyres();
        c.fuel();
        c.fuel("Diesel");
        c.seatings();
        Bike b=new Bike();
        b.no_of_tyres();
        b.fuel();
        b.seatings();
	}
}
