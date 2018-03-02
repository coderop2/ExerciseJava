package javaapplication84;
import java.util.Scanner;

public class JavaApplication84 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        loop:
        for(int i=0;i<Q;i++)
        {
            int Y=sc.nextInt();
            int Z=sc.nextInt();
            String s=sc.next();
            if(Z==arr[Y])
            {
                System.out.println("0");
                continue loop;
            }
            int count=0;
            if(s.equals("L"))
            {
                int size=0;
                while(size!=(arr.length))
                {
                    count++;
                    if(arr[(Y-1+N)%N]==Z)
                    {
                        System.out.println(count);
                        continue loop;
                    }
                    else
                        Y--;
                    size++;
                }
                if(size==arr.length)
                    System.out.println(-1);
            }
            else if(s.equals("R"))
            {
                int size=0;
                while(size!=arr.length)
                {
                    count++;
                    if(arr[(Y+1)%N]==Z)
                    {
                        System.out.println(count);
                        continue loop;
                    }
                    else
                        Y++;
                    size++;
                }
                if(size==arr.length)
                    System.out.println(-1);
            }
            else
                System.out.println("Pls input valid shift");
        }
    }
}
