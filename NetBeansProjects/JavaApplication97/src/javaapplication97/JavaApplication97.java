package javaapplication97;
import java.util.*;

public class JavaApplication97 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int N=sc.nextInt();
            int K=sc.nextInt();
            int arr[]=new int[N];
            for(int j=0;j<N;j++)
                arr[j]=sc.nextInt();
            Arrays.sort(arr);
            int count=1;
            for(int j=1;j<N;j++)
            {
                if(arr[j-1]==arr[j])
                    continue;
                else
                    count++;
            }
            if(count==K)
                System.out.println("Good");
            else if(count>K)
                System.out.println("Average");
            else
                System.out.println("Bad");
        }
    }
}
