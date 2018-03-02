package javaapplication82;
import java.util.*;
class linkedlist
{
    int index, popularity;
    linkedlist next;
    linkedlist(int a,int b)
    {
        index=a;
        popularity=b;
    }
}
public class JavaApplication82 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int N=sc.nextInt();
            int X=sc.nextInt();
            if(X>N)
                System.exit(0);
            for(int j=0;j<N;j++)
            {
                int ele=sc.nextInt();
                linkedlist ll;
                if(j==0)
                    ll=new linkedlist(0,ele);
                else
                    ll=new linkedlist(j,ele);
            }
        }
    }
}
