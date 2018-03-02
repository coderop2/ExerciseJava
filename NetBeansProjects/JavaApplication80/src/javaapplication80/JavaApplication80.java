package javaapplication80;
import java.util.*;
class clerk
{
    int height,startTime,endTime;
    clerk(int a,int b,int c)
    {
        height=a;
        startTime=b;
        endTime=c;
    }
}
public class JavaApplication80 
{
    int[] compare(clerk q[],int c)
    {
        int[] bool=new int[q.length];
        for(int i=0;i<q.length;i++)
        {
            if(c<q[i].startTime||c>q[i].endTime)
                bool[i]=-1;
            else
                bool[i]=1;
        }
        return bool;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int C=sc.nextInt();
        int Q=sc.nextInt();
        clerk[] q=new clerk[C];
        for(int i=0;i<C;i++)
        {
            int height=sc.nextInt();
            int start=sc.nextInt();
            int end=sc.nextInt();
            q[i]=new clerk(height,start,end);
        }
        int[] bool;
        JavaApplication80 ob=new JavaApplication80();
        for(int i=0;i<Q;i++)
        {
            int count=0,freq=0;
            int height=sc.nextInt();
            int start=sc.nextInt();
            bool=ob.compare(q, start);
            for(int j=0;j<q.length;j++)
            {
                if(bool[j]==1)
                    count++;
                if(bool[j]==1&&q[j].height<height)
                    freq++;
            }
            if(freq==count)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        

    }
    
}
