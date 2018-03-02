package testclass;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    boolean testBubbly(String s)
    {
        int count=0;
        String sh=s.toUpperCase();
        char ch[]=sh.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='A'||ch[i]=='B');
            else
            {
                System.err.print("Pls input just A or B");
                return false;
            }
        }
        boolean bool[]=new boolean[ch.length+3];
        Arrays.fill(bool, false);
        loop1:
        for(int i=0;i<ch.length+1;i++)
        {
            loop2:
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    bool[i]=bool[j]=true;
                    count++;
                    if(j>1)
                    {
                    if(bool[j-2]==true&&bool[j+1]==true)
                    {
                        return true;
                    }
                    }
                    break;
                }
                if(bool[j-1]==true||bool[j+1]==true)
                    {
                        count=0;
                    }
                
            }
        }
        return count==0?false:true;
    }
    public static void main(String[] args) 
    {
        int count=0;
        TestClass ob=new TestClass();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        loop3:
        for(int i=0;i<=a;i++)
        {
            String s=sc.nextLine();
            if(ob.testBubbly(s)==true)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
