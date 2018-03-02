package javaapplication88;
import java.util.*;

public class JavaApplication88 
{
    int[] inversion(int arr[])
    {
        int a;
        int arr1[]=arr;
        for(int x=0;x<1;x++)
        {
            a=arr1[0];
            for(int y=0;y<arr1.length-1;y++)
            {
                arr1[y]=arr1[y+1];
            }
            arr1[arr1.length-1]=a;
        }
        return arr1;
    }
    public static void main(String[] args) 
    {
        JavaApplication88 ob=new JavaApplication88();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count;
        for(int i=0;i<N;i++)
        {
            count=0;
            arr=ob.inversion(arr);
            for(int x=0;x<arr.length;x++)
            {
                for(int y=x;y<arr.length;y++)
                {
                    if(arr[x]>arr[y])
                        count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}
