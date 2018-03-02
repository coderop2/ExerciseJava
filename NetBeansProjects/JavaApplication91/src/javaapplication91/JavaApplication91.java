
package javaapplication91;

import java.util.LinkedList;
import java.util.Scanner;
public class JavaApplication91 {
    LinkedList remove(LinkedList<Integer> l)
    {
        int n=l.size();
        for(int i=0;i<n;i++)
        {
            if(i!=(n-1))
            {
                if(l.get(i)<l.get(i+1))
                {
                    l.remove(i);
                    break;
                }
            }
            else
                l.removeLast();
        }
        return l;
    }
    public static void main(String[] args) 
    {
        JavaApplication91 ob=new JavaApplication91();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int N=sc.nextInt();
            int k=sc.nextInt();
            LinkedList<Integer> l=new LinkedList<>();
            for(int j=0;j<N;j++)
            {
                l.add(sc.nextInt());
            }
            for(int j=0;j<k;j++)
            {
                l=ob.remove(l);
            }
            for(int x=0;x<N-k;x++)
            {
                System.out.print(l.poll()+" ");
            }
            System.out.println();
        }
    }
    
}
