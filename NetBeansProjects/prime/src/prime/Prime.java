package prime;
import java.util.*;
public class Prime
{
    
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<2)
            System.out.println("the number is ");
        else
            System.out.println("pls proceed");
        for(int i=2;i<x;i++)
        {
            if((x%i)==0)
            {
                System.out.println("the number is not prime");
                break;
            }
            else
                System.out.println("the numver is prime");break;
        }
    }
    
}
