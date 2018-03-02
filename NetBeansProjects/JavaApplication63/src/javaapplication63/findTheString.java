package javaapplication63;
import java.util.Arrays;
import java.util.Scanner;

public class findTheString 
{
    void findstring(String s,String ch[][], int rows, int columns)
    {
        String testString=s;
        char 
        ch1[]=testString.toCharArray();
        int length=ch1.length;
        boolean bool[]=new boolean[ch1.length+5];
        Arrays.fill(bool, false);
        loop1:
        for(int i=0;i<rows;i++)
        {
            loop2:
            for(int j=0;j<columns;j++)
            {
                if(ch[i][j].equals(ch1[i]))
                {
                    bool[i]=true;
                }
                while((i+rows)!=ch1.length)
                {
                    if(bool[i]==true)
                    {
                        if(ch[i][j].equals(ch1[i+rows]))
                        {
                            bool[i+rows]=true;
                        }
                    }
                }
            }
            if(bool[i]==false)
                {
                    System.err.println("The word cannot be printed from the given matrix of letters");
                    System.exit(0);
                }
            
        }
        int y=0;
        while((length--)!=0)
        {
            if(bool[length]==true)
                y++;
            else
                y--;
        }
        if(y==length)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int N=sc.nextInt();
            int M=sc.nextInt();
            if(N<0||M<0)
            {
                System.err.println("Pls INput Valid Rows or Columns");
                System.exit(0);
            }
            String ch[][]=new String[N+1][M+1];
            for(int x=0;x<N;x++)
            {
                for(int y=0;y<M;y++)
                {
                    ch[x][y]=sc.next();
                    ch[x][y]=ch[x][y].toLowerCase();
                }
            }
            
            String s=sc.nextLine();
            s=s.toLowerCase();
            new findTheString().findstring(s, ch, N, M);
        }
    }
}
