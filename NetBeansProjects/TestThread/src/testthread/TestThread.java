package testthread;
class RunnableDemo extends Thread {
   Thread t;
   String threadName;
   
   RunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
      System.out.println("Starting " +  threadName );
         t = new Thread (this, threadName);
         t.start ();
   }
   public void run()
   {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      }catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
}

public class TestThread {

   public static void main(String args[]) {
      RunnableDemo R1 = new RunnableDemo( "Thread-1");

      RunnableDemo R2 = new RunnableDemo( "Thread-2");
      
   }   
}
