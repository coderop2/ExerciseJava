package javaapplication76;
import java.util.*;

public class JavaApplication76 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int freq;
        loop:
        for(int i=0;i<N;i++)
        {
            freq=1;
            int size=0,xy,pain=0;
            int a=sc.nextInt(),b=sc.nextInt();
            int in[]=new int[a];
            String st[]=new String[a];
            if(a%b!=0)
            {
                System.err.println("Pls input valid digits");
                System.exit(0);
            }
            for(int j=0;j<a;j++)
            {
                st[j]=sc.next().toLowerCase();
                in[j]=st[j].length();
            }
            Arrays.sort(in);
            if(b==1)
            {
                System.out.println("Possible");
                continue loop;
            }
            else
            {
                for(int x=0;x<(a/b);x++)
                {
                    xy=0;
                    freq=1;
                    if(in[0]==in[1])
                    {
                        while(xy!=(b-1))
                        {
                            if(in[size]==in[size+1])
                                freq++;
                            if((size)!=in.length)
                                size++;
                            xy++;
                        }
                        size++;
                        if(freq!=b)
                            pain--;
                        else
                            pain++;
                    }
                }
                if(pain==(a/b))
                    System.out.println("Possible");
                else
                    System.out.println("Not possible");
            }
        }
    }
    
}
