package set1;
import java.util.*;
class Contacts
{
    String contact;
    int number;
    Contacts()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the contact name-");
        contact=sc.nextLine();
        System.out.print("enter the number of the contact-");
        number=sc.nextInt();
    }
    void u()
    {
        System.out.print(" ");
    }
}
public class Set1 {

   public static void main(String args[])
   {
       Scanner er=new Scanner(System.in);
       Contacts a=new Contacts();
       Contacts c=new Contacts();
       Contacts b=new Contacts();
      HashSet hs=new HashSet();
      hs.size();
      hs.add(a.contact+a.u()+a.number);
      hs.add(c.contact+c.number);
      hs.add(b.contact+b.number);
      hs.add(3);
      System.out.println(hs);
      System.out.println("do you want to enter more contacts y/n");
      String fg=er.next();
      Iterator i=hs.iterator();
      while(i.hasNext())
      {
          System.out.println(i.hashCode());
      }
      if(fg.contains(fg="y"))
      {
          Contacts h=new Contacts();
          hs.add(h.contact+h.number);
          System.out.println(hs);
      }
      else
      {
          System.out.println("oops");
                  
      }
   }
}
