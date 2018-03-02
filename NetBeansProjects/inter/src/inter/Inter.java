package inter;
interface a
{
    int a=5;
    int b=5;
    public int display();
}
class d implements a
{
    public int c;
    public int display()
    {
        c=a+b;
        
    }
    public void get()
            {
                
               System.out.println("The number is"+c); 
            }
}
public class Inter
{
    public static void main(String[] args)
    {
        
        d ob=new d();
        ob.display();
        ob.get();
        
    }
    
}
