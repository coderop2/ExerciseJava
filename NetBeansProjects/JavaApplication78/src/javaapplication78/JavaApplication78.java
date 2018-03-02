
package javaapplication78;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication78 
{
    boolean cheaka(char ch[])
    {
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a')
                return true;
            else 
                return false;
        }
        return true;
    }
    boolean cheake(char ch[])
    {
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='e')
                return true;
            else 
                return false;
        }
        return true;
    }
    boolean cheaki(char ch[])
    {
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='i')
                return true;
            else 
                return false;
        }
        return true;
    }
    boolean cheako(char ch[])
    {
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='o')
                return true;
            else 
                return false;
        }
        return true;
    }
    boolean cheaku(char ch[])
    {
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='u')
                return true;
            else 
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N>=100)
        {
            String s=sc.nextLine().toLowerCase();
            char ch[]=s.toCharArray();
            if(ch.length!=s.length())
                System.exit(0);
            JavaApplication78 ob=new JavaApplication78();
            boolean bool[]=new boolean[5];
            Arrays.fill(bool, false);
            Arrays.sort(ch);
            if(ob.cheaka(ch)==true)
            {
                bool[0]=true;
                count++;
            }
            if(ob.cheake(ch)==true)
            {
                bool[1]=true;
                count++;
            }
            if(ob.cheaki(ch)==true)
            {
                bool[2]=true;
                count++;
            }
            if(ob.cheako(ch)==true)
            {
                bool[3]=true;
                count++;
            }
            if(ob.cheaku(ch)==true)
            {
                bool[4]=true;
                count++;
            }
            if(count==5)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
        {
            String s=sc.next().toLowerCase();
            char ch[]=s.toCharArray();
            if(ch.length!=s.length())
                System.exit(0);
            JavaApplication78 ob=new JavaApplication78();
            boolean bool[]=new boolean[5];
            Arrays.fill(bool, false);
            Arrays.sort(ch);
            if(ob.cheaka(ch)==true)
            {
                bool[0]=true;
                count++;
            }
            if(ob.cheake(ch)==true)
            {
                bool[1]=true;
                count++;
            }
            if(ob.cheaki(ch)==true)
            {
                bool[2]=true;
                count++;
            }
            if(ob.cheako(ch)==true)
            {
                bool[3]=true;
                count++;
            }
            if(ob.cheaku(ch)==true)
            {
                bool[4]=true;
                count++;
            }
            if(count==5)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
}
