import java.util.Random;

//Thread Example by extending Thread class
public class ExtendThread extends Thread{	
	
	private String threadName;
	Random r = new Random();
	
	ExtendThread(String name){
		threadName = name;
		System.out.println("Creating " +  threadName );
		this.start();
	}
	
	public void run() {
		System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println(threadName + ": " + r.nextInt(0,100));
	            // Let the thread sleep for a while.
	            Thread.sleep(150);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	}
}