
package javaapplication72;
import java.util.*;
class node implements Comparable<node>
{
    int key,value;
    node(int a,int b)
    {
        key=a;
        value=b;
    }
@Override
    public int compareTo(node o) {
        if(value<o.value)
            return -1;
        else if(value>o.value)
            return 1;
        else return 0;
    }
}
public class JavaApplication72 {
    node findmax(node a[])
    {
        node max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max.compareTo(a[i])==-1)
            {
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        Queue<node> q=new PriorityQueue<>();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b>a)
            b=a;
        for(int i=0;i<a;i++)
        {
            int c=sc.nextInt();
            if(c<0)
                System.exit(0);
            q.offer(new node(i,c));
        }
        node t=q.peek();
            if(b==1)
            {
                System.out.print(t.key+1+" ");
                System.exit(0);
            }
        for(int x=0;x<b;x++)
        {
            node arr1[];
            if(b<q.size())
                arr1=new node[b];
            else
                arr1=new node[q.size()];
            for(int j=0;j<arr1.length;j++)
            {
                arr1[j]=q.poll();
            }
            for(int j=0;j<arr1.length;j++)
            {
                System.out.print(arr1[j].key+" ");
            }
            System.out.println();
            JavaApplication72 ob=new JavaApplication72();
            node keyf=ob.findmax(arr1);
            System.out.print((keyf.key+1)+" ");
            loop:
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i].key==keyf.key)
                    continue loop;
                else
                {
                    if(arr1[i].value==0);
                    else
                        arr1[i].value=arr1[i].value-1;
                    q.add(arr1[i]);
                }
            }
        }
    }
    
}
