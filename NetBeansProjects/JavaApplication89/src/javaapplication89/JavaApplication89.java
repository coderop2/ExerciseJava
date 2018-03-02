package javaapplication89;
import java.util.*;

public class JavaApplication89 
{
    int[] remove(int arr[])
    {
        int n=arr.length;
        int arr1[]=new int[n-1];
        for(int i=0;i<n;i++)
        {
            if(i!=(n-1))
                if(arr[i]<arr[i+1])
                {
                    arr[i]=0;
                    break;
                }
            else
                arr[n-1]=0;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
                arr1[i]=arr[i];
        }
        return arr1;
    }
    public static void main(String[] args) 
    {
        JavaApplication89 ob=new JavaApplication89();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int N=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[N],arr11[]=new int[N];
            for(int j=0;j<N;j++)
            {
                arr[i]=sc.nextInt();
            }
            for(int j=0;j<k;j++)
            {
                arr11=ob.remove(arr);
            }
            for(int x=0;x<N-k;x++)
            {
                System.out.println(arr11[i]);
            }
        }
    }
}
