package gen;
class a<t,z>
{
    private t s;
    private z e;
    a(t ab,z d)
    {
        s=ab;
        e=d;
    }
    t getResult()
    {
        return s;
    }
    z display()
    {
        return e;
    }
    
}
public class Gen
{
    public static void main(String[] args) 
    {
        a<Integer, String> q=new a<>(5,"oops");
        System.out.println(q.getResult()+" "+q.display());
        a<String, Integer> W=new a<>("Test",1);
        System.out.println(W.getResult()+" "+W.display());
    }
    
}
