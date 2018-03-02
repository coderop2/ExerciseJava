package p;
public class P
{
    public enum dogs{as,ad};
    
    public static void main(String[] args)
    {
        dogs a=dogs.as;
        switch(a)
        {
            case as:
                System.out.println("as");
            case ad:
                System.out.println("ad");
        }
    }
}
