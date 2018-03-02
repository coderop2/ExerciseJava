package ariprob;
import java.util.*;
public class Ariprob
{
    void random(int x)
    {
        int y=x-1;
        System.out.println("The wrong number is"+y);
    }
    public static void main(String[] args) 
    {
        int sub=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
            sub=a-b;
        else
            System.out.println("Enter valid numbers");
        System.out.println("The subtraction two numbers is"+sub);
        Ariprob obj=new Ariprob();
        obj.random(sub);
    }   
}
