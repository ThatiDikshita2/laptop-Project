
	class Car implements Vehicle {
	   @Override
	    public void start() {
	        System.out.println("Car is starting.");
	    }
	    @Override
	    public void move() {
	        System.out.println("Car is moving.");
	    }
	    @Override
	    public void stop() {
	        System.out.println("Car has stopped.");
	    }
	}
