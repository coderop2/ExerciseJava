package atm;
import java.util.Scanner;
public class ATM 
{
    public int q,w,e,r,count;
     void checkn(int a)
    {
        if(a>=2000)
        {
            q=a;
            System.out.println(q);
        }
        else if(a>=1000&&a<2000)
        {
            w=a;
            System.out.println(w);
        }
        else if(a>=500&&a<1000)
        {
            e=a;
            System.out.println(e);
        }
        else if(a>0&&a<500)
        {
            r=a;
            System.out.println(r);
        }
    }
     void output(int x)
     {
         if(x<1000&&x>500)
         {
             x=x-e;
             count++;
             while(x>0)
             {
                 x=x-r;
                 count++;
             }
         }
         elseif(x>=1000&&x)
     }
    public static void main(String[] args) 
    {
        ATM aq=new ATM();
        System.out.println("Pls Enter the amount to be withdrawen:-");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Pls enter the Total kind of Currency you want");
        int b=sc.nextInt();
        for(int i=0;i<=b;i++)
        {
            System.out.println("Enter the "+i+" Currency");
            int c=sc.nextInt();
            aq.checkn(c);
        }
    }
    
}
