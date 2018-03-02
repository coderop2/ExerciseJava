package javaapplication74;
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
public class JavaApplication74 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Deque<node> ob=new ArrayDeque<>();
        Deque<node> ob1=new ArrayDeque<>();
        boolean bool[]=new boolean[4];
        Arrays.fill(bool, false);
        loop:
        for(int i=0;i<N;i++)
        {
            String s=sc.next();
            if(s.equals("E"))
            { 
                int schooln=sc.nextInt();
                int rolln=sc.nextInt();
                if(schooln>4||schooln<1||rolln<1||rolln>50000)
                    System.err.print("Pls input valid inputs");
                if(bool[schooln-1]==false)
                {
                    ob.offer(new node(schooln,rolln));
                    bool[schooln-1]=true;
                }
                else
                {
                    ob1.clear();
                    node q=ob.removeFirst();
                    for(int r=0;r<ob.size();r++)
                    {
                        if(schooln==q.key)
                            break;
                        else
                        {
                            ob1.offer(q);
                            q=ob.poll();
                        }
                    }
                    while(schooln==q.key)
                    {
                        if(rolln==q.value)
                            continue loop;
                        ob1.offer(q);
                        if(ob.isEmpty())
                            break;
                        else
                            q=ob.removeFirst();
                    }
                    if(q==null);
                    else
                        ob.addFirst(q);
                    ob.offerFirst(new node(schooln,rolln));
                    int z=ob1.size();
                    for(int w=0;w<z;w++)
                    {
                        ob.offerFirst(ob1.pollLast());
                    }
                }
            }
            else
            {
                node de=ob.pollFirst();
                if(ob.size()==1)
                    Arrays.fill(bool, false);
                System.out.println(de.key+" "+de.value);
            }
        }
    }
    
}
