package oops5;

public abstract class MyVehicle implements Vehicle{
     public void start() {
    	 System.out.println("start....");
     } 
     public void move() {
    	 System.out.println("move....");
     } 
     public abstract void stop();
     public abstract void noOfWheels();    
}
