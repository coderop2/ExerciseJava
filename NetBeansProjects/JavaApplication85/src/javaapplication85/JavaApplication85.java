package javaapplication85;

import java.util.Scanner;

public class JavaApplication85 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();
        int arrA[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arrA[i]=sc.nextInt();
        }
        int arrB[]=new int[M];
        for(int i=0;i<M;i++)
        {
            arrB[i]=sc.nextInt();
        }
        int count=0,a=1,freq=0,b,c;
        loop:
        for(int i=0;i<N;i++)
        {
            b=0;
            while(b!=a)
            {
                for(int y=0;y<M;y++)
                {
                    c=0;
                    while(c!=a)
                    {
                        if(arrA[i+b]==arrB[y+c])
                            freq++;
                        c++;
                    }
                }
                b++;
            }
            if(freq>=K)
                count++;
            freq=0;
            if((i+a)==(N))
            {
                while(a!=N)
                {
                    a++;
                    continue loop;
                }
            }
        }
        System.out.println(count);
    }
}
