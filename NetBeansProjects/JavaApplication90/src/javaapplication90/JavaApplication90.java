package javaapplication90;
import java.util.*;
public class JavaApplication90 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    Queue<Integer> q=new PriorityQueue<>();
    for(int i=0;i<N;i++)
    {
        q.add(sc.nextInt());
    }
    for(int i=0;i<N;i++)
    {
        System.out.println(q.poll());
    }
    for(int i=0;i<N;i++)
    {
        q.offer(sc.nextInt());
    }
    for(int i=0;i<N;i++)
    {
        System.out.println(q.remove());
    }
    }
    
}
