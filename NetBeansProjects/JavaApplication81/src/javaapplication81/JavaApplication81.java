package javaapplication81;
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
public class JavaApplication81 
{
    boolean compare(clerk q[],int c, int a)
    {
        boolean bool=true;
        for(int i=0;i<q.length;i++)
        {
            if(c<q[i].startTime||c>q[i].endTime)
                bool=true;
            else
            {
                if(a>q[i].height)
                    bool=true;
                else
                    bool=false;
            }
            if(bool==false)
                return bool;
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
            if(start<0||end>H)
                System.err.println("The time of the planet is"+H);
            if(end<start)
                break;
            q[i]=new clerk(height,start,end);
        }
        boolean bool;
        JavaApplication81 ob=new JavaApplication81();
        for(int i=0;i<Q;i++)
        {
            int height=sc.nextInt();
            int start=sc.nextInt();
            bool=ob.compare(q, start,height);
            if(start<0||start>H)
                bool=false;
            if(bool)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
