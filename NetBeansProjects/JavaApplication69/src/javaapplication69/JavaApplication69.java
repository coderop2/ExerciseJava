package javaapplication69;
import java.util.*;

public class JavaApplication69 
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,y=0;
	int nextBig[], prevBig[];
	int d[];
        
        n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        
	nextBig = new int[n];
	prevBig = new int[n];
	d = new int[n];
        
	for(int i=0;i<n;i++)
        {
            nextBig[i] = -1;
            prevBig[i] = -1;
	}
	Stack<Integer> s = new Stack<>();
	for (int i = 0; i < n; i++) 
        {
            while (!s.isEmpty() && a[s.peek()] < a[i])
            {
		nextBig[s.pop()]=i;
                y++;
            }
		s.push(i);
        }
        s.clear();
        for (int i = n-1; i >=0; i--)
        {
            while (!s.isEmpty() && a[s.peek()] < a[i])
            {
		prevBig[s.pop()]=i;
            }
            s.push(i);
	}
	long ans = 0;
	for(int i=0;i<n;i++)
        {
            if(nextBig[i]!=-1)
            {
		d[nextBig[i]-i]= Math.max(d[nextBig[i]-i],i-prevBig[i]);
            }
	}
	for(int i=0;i<n;i++)
        {
            ans += d[i];
	}
	System.out.println(ans);
        System.out.println(y);
    }
}
