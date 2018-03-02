package thread;
class NewThread implements Runnable
{
    String s;
    Thread t;
    NewThread(String g)
    {
        s=g;
        t = new Thread(this, s);
        System.out.println("New Thread: "+t);
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=0;i>0;i--)
            {
                System.out.println(s+":"+i);
                t.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
                System.out.println(s+"Interrupted");
        }
                System.out.println(s+"Exiting");
    }
}
public class Thread 
{
    public static void main(String[] args) 
    {
        NewThread t=new NewThread("one");
        new NewThread("Two");
    }
    
}
