package gui;
class foo
{
    public int a=3;
    public void  addfive()
    {
        a+=5;
        System.out.println("f");
    }
}
class bar extends foo
{
    public int a=8;
    public void addfive()
    {
        a+=5;
        System.out.println("b");
    }
}
public class Gui
{
    public static void main(String[] args)
    {
        foo f=new bar();
        f.addfive();
        System.out.println(f.a);
    }
    
}
