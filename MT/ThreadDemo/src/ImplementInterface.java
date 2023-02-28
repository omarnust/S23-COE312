import java.util.Random;

public class ImplementInterface implements Runnable{	
	private String threadName;
	Random r = new Random();
	private Thread t;
	
	ImplementInterface(String name){
		threadName = name;
		System.out.println("Creating " +  threadName );
		
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		t.setName("ABCD");
		
		System.out.println(t.getName());
		
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
	public Thread getThread() {
		return t;
	}

}