
import java.util.*;

public class En 
{
    int checkfreq(int arrA[],int arrB[])
    {
        int count=0;
        for(int i=0;i<arrA.length;i++)
        {
            for(int j=0;j<arrB.length;j++)
            {
                if(arrA[i]==arrB[j])
                    count++;
            }
        }
        return count;
    }
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
        int a=1,x=0,count=0;
        En ob=new En();
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<M;j++)
                {
                    x=ob.checkfreq(Arrays.copyOfRange(arrA, i, i+a), Arrays.copyOfRange(arrB, j, j+a));
                    if(x>=K)
                        count++;
                }
                if((i+a)==N)
                {
                    if(a!=N)
                        a++;
                    else break;
                }
            }
        System.out.println(count);
    }    
}
