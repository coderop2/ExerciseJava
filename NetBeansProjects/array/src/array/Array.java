package array;
import java.util.*;
public class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ob[]=new int[5];
        System.out.println("Enter the Array");
        for(int i=0;i<5;i++)
        {
            ob[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("Entered Array is - "+ob[i]);
        }
    }
    
}
