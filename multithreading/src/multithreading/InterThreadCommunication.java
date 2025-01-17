package multithreading;
 class BhahubaliThread extends Thread{
	 int total = 0;
	 @Override
	 public void run() {
		 for(int i = 1; i<=100; i++) {
			 total += i;
		 }
		 synchronized (this) {
   		 // this.notify();	
			 this.notifyAll(); 
		} 
		 //perform some other logic
	 }
 }
public class InterThreadCommunication {
      public static void main(String[] args) throws InterruptedException {
    	  BhahubaliThread b = new BhahubaliThread();
    	  b.start();
    	 // b.join();
    	 // Thread.sleep(100);
    	  //main thread
    	  synchronized (b) {
    		  b.wait();	
		} 
    	  System.out.println(b.total);
      }
}
