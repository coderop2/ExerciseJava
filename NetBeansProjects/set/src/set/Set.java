package set;
import java.util.*;
class  contacts
{
    Scanner sc=new Scanner(System.in);
    String contact;
    contacts()
    {
        System.out.println("Enter the contact=");
        contact=sc.nextLine();
    }
    String getContact()
    {
        return contact;
    }
}
public class Set
{
    public static void main(String[] args)throws NullPointerException
    {
        try
        {
        contacts c=new contacts();
        System.out.println("is the contact uentered -"+c.getContact());
        }
        catch(NullPointerException e)
        {
            System.out.println("OOPS");
        }
    }
    
}
