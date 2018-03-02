package javaapplication77;
import java.util.*;
public class JavaApplication77 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++)
        {
            int freq=0;
            String s=sc.next().toLowerCase();
            String s1=sc.next().toLowerCase();
            char ch[]=s.toCharArray();
            char ch1[]=s1.toCharArray();
            loop:
            for(int j=0;j<ch1.length;j++)
            {
                for(int x=0;x<ch.length;x++)
                {
                    if(ch[x]==ch1[i])
                    {
                        freq++;
                    }
                }
                if(freq>1)
                    break;
            }
            if(freq>0)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
    
}
