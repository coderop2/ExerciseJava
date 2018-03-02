package overriding;
public class Overriding
{
    public void display()
    {
        System.out.println("This is the main function");
    }
}
class oss extends Overriding
{
        public void display()
    {
        System.out.println("This is the overriding function");
    }
}

