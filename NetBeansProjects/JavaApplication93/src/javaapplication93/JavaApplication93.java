package javaapplication93;
import java.util.*;

public class JavaApplication93 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int C=sc.nextInt();
        int[] parentnode=new int[N+1];
        int[] colourofnode=new int[N+1];
        parentnode[1]=0;
        for(int i=2;i<N+1;i++)
        {
            parentnode[i]=sc.nextInt();
        }
        for(int i=1;i<N+1;i++)
        {
            colourofnode[i]=sc.nextInt();
        }
        boolean bool[]=new boolean[C+1];
        Arrays.fill(bool, false);
        int i=1;
        while(i!=(N+1))
        {
            if(bool[colourofnode[i]]==false)
            {
                System.out.print(-1+" ");
                bool[colourofnode[i]]=true;
            }
            else
            {
                int j=parentnode[i];
                int ans=-1;
    		while(j>0)
                {
                    if(colourofnode[i]==colourofnode[j])
                    {
                        ans=j;
                        break;
                    }
                    j=parentnode[j];
    		}
    		System.out.print(ans+" ");
            }
            i++;
        }
    }   
}
