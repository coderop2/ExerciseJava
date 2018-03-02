package javaapplication37;
class a
{ 
    int q;
    char s='f';
    a(int i)
    {
        q=i;
    }
    a b()
    {
        a c=new a(q=45);
        return c;
    }
}
public class JavaApplication37
{
    public static void main(String[] args) 
    {
        a t=new a(2);
        a w;
        w=t.b();
        System.out.println(t.q);
        System.out.println(t.s);
        System.out.println(w.q);
        System.out.println(w.s);
        w=w.b();
        System.out.println(w.q);
    }
    
}
