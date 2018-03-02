package ne;
import java.util.*;
public class Ne 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[10];
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("The entered array i:");
        for(int i:array)
        {
            System.out.println(i);
        }
    }
    
}
