package javaapplication73;
import java.util.*;
class node implements Comparable<node>, Comparator<node>
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

    @Override
    public int compare(node o1, node o2) 
    {
        if(o1.key>o2.key)
            return 1;
        else if(o1.key<o2.key)
            return -1;
        else return 0;
    }
}
class queue<node>
{
    public node arr[]=(node[])new Object[1000000];
    int front,end;
    int size;
    queue()
    {
        front=end=-1;
        size=0;
    }
    void enque(int a,int b,node ob)
    {
        if(end==arr.length)
            System.err.println("The queue is full of elements");
        else
        {
            arr[++end]=ob;
            size++;
        }
    }
    void enque1(int a,int b,node ob,int count)
    {
        if(end==arr.length)
            System.err.println("The queue is full of elements");
        else
            for(int i=0;i<count;i++)
            {
                if()
                    ;
            }
    }
    node deque()
    {
        if(front==-1)
        {
            System.err.println("The queue is empty");
            return null;
        }
        else
        {
            size--;
            return arr[front++];
        }
    }
    node peek()
    {
        if(front==-1)
            return null;
        else return arr[front];
    }
}
public class JavaApplication73 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        queue ob=new queue();
        node de=new node(0,0);
        boolean bool[]=new boolean[4];
        Arrays.fill(bool, false);
        for(int i=0;i<N;i++)
        {
            int count=0;
            String s=sc.nextLine();
            String arr1[]=s.split(" ");
            int schooln=Integer.parseInt(arr1[1]);
            int rolln=Integer.parseInt(arr1[2]);
            if(arr1[0].equals("E"))
            {
                ++count;
                if(bool[schooln-1]==false)
                    ob.enque(schooln,rolln,new node(schooln,rolln));
                else
                    ob.enque1(schooln,rolln,new node(schooln,rolln),count);
            }
            else
            {
                --count;
                de=(node)ob.deque();
            }
            System.out.print(de.key+" "+de.value);
        }
    }
    
}
