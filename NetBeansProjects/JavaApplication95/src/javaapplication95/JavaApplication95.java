package javaapplication95;
import java.util.*;

public class JavaApplication95 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int levels[]=new int[262145];
        int lvlc=1,lvlc1=1;
        for(int i=1;i<18;i++)
        {
            int freq=0;
            while(freq<lvlc1)
            {
                levels[lvlc++]=i;
                freq++;
            }
            lvlc1=lvlc1*2;
        }
        levels[262144]=19;
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            StringBuilder sb=new StringBuilder();
            int N=sc.nextInt();
            LinkedList<Integer> ar[]=new LinkedList[20];
            for(int i=1;i<=18;i++)
                ar[i]=new LinkedList<>();
            for(int i=1;i<N;i++)
            {
                int a=sc.nextInt();
                if(a==0)
                    continue;
                else
                    ar[levels[i]].add(a);
            }
            for(int i=1;i<=18;i++)
                if(ar[i].size()>0)
                  sb.append(ar[i].getLast()+"\n");
           for(int i=1;i<=18;++i)
               if(ar[i].size()>1)
                   sb.append(ar[i].getFirst()+"\n");
           System.out.println(sb);
        }
    }
}
