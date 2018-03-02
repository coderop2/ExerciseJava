package javaapplication92;
import java.util.*;

public class JavaApplication92 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int N=sc.nextInt();
            int K=sc.nextInt();
            int count=0,size=0;
            int arr[]=new int[N-K];
            loop:
            for(int j=0;j<N;j++)
            {
                if(j==0)
                {
                    arr[0]=sc.nextInt();
                    size++;
                }
                else
                {
                    if(count!=K)
                    {
                        int a=sc.nextInt();
                        if(a>arr[j-1])
                        {
                            arr[j-1]=a;
                            j--;
                            count++;
                            size++;
                            if((j)!=0&&count!=K)
                            {
                                while(j!=0&&count!=K&&a>arr[j-1])
                                {
                                    arr[j-1]=a;
                                    j--;
                                    count++;
                                }
                            }
                        }
                        else
                        {
                            arr[j]=a;
                            size++;
                        }
                    }
                    else
                    {
                        int a=sc.nextInt();
                        arr[j]=a;
                        size++;
                    }
                    if(size==(N))
                        break;
                }
            }
            for(int j=0;j<arr.length;j++)
            {
                    System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
