package abs;
abstract class test
{
    abstract void display();
}
class b extends test
{
    public void display()
    {
        System.out.println("one");
    }
}
public class Abs
{
    public static void main(String[] args) 
    {
        b ob=new b();
        ob.display();
    }
    
}
