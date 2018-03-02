
package javaapplication75;
import java.util.*;
import java.lang.Math;

public class JavaApplication75 {
    int dosomething(char c)
    {
        return c-'a';
    }
    int[] putinarray(char ch[],int arr[])
    {
        for(int i=0;i<ch.length;i++)
        {
            int index=dosomething(ch[i]);
            arr[index]++;
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        JavaApplication75 ob=new JavaApplication75();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            int chhash[]=new int[26];
            int ch1hash[]=new int[26];
            String s=sc.next();
            char ch[]=s.toCharArray();
            String s1=sc.next();
            char ch1[]=s1.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            if(Arrays.equals(ch, ch1))
            {
                System.out.println(0);
            }
            else
            {
                int freq=0;
                chhash=ob.putinarray(ch, chhash);
                ch1hash=ob.putinarray(ch1, ch1hash);
                for(int j=0;j<26;j++)
                {
                    int a;
                    a=chhash[j]-ch1hash[j];
                    freq=freq+Math.abs(a);
                }
                System.out.println(freq);
            }
        }
    }
}
