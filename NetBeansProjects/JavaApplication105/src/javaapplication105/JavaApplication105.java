package javaapplication105;
import java.util.*;

public class JavaApplication105 {
    int ar[];
    JavaApplication105(int N)
    {
        ar=new int[N+1];
    }
    void tree(int index,int num)
    {
        for(;index<ar.length;index+=index&-index)
            ar[index]+=num;
    }
    int sum(int i)
    {
        int sum=0;
        for(;i>0;i-=i&-i)
            sum+=ar[i];
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N+1];
        JavaApplication105 ob=new JavaApplication105(N);
        for(int i=1;i<N+1;i++)
        {
            int a=sc.nextInt();
            arr[i]=a;
            if(a%2==0)
                ob.tree(i,1);
        }
        int Q=sc.nextInt();
        while(Q-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            switch(a)
            {
                case 0:
                    if(arr[b]%2==0&&c%2==1)
                        ob.tree(b, -1);
                    if(arr[b]%2==1&&c%2==0)
                        ob.tree(b, 1);
                    arr[b]=c;
                    break;
                case 1:
                    int t=ob.sum(c)-ob.sum(b-1);
                    System.out.println(t);
                    break;
                case 2:
                    int u=ob.sum(c)-ob.sum(b-1);
                    System.out.println(c-b+1-u);
                    break;
                default:
                    System.out.println("Pls guve a valid input");
                    break;
            }
        }
    }
    
}
