package javaapplication71;
import java.util.*;
 
public class JavaApplication71 
{
    int findMax(int a[])
    {
        Arrays.sort(a);
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
    int findIndex(int a,int arr[])
    { 
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
                return i;
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[a];
        Queue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<a;i++)
        {
            int c=sc.nextInt();
            q.offer(c);
            arr[i]=c;
        }
        for(int x=0;x<b;x++)
        {
            int arr1[];
            if(b<q.size())
                arr1=new int[b];
            else
                arr1=new int[q.size()];
            for(int j=arr1.length-1;j>0;j--)
            {
                arr1[j]=q.poll();
            }
            JavaApplication71 ob=new JavaApplication71();
            int y=ob.findMax(arr1);
            System.out.println(ob.findIndex(y,arr));
            for(int e=0;e<arr1.length-1;e++)
            {
                if(arr1[e]==0)
                    q.offer(0);
                else
                {
                arr1[e]=arr1[e]-1;
                q.offer(arr1[e]);
                }
            }
        }
    }
    
}
