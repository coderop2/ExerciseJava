package javaapplication109;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaApplication109 
{
    static String[] strs = new String[2];
    static void fff()throws IOException
    {
//        Scanner sc=new Scanner(System.in);
//            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//            String arr[]=new String[100000];
//            int c=0;
//            while(sc.hasNext())
//                arr[c++]=sc.next();
//            int v=0;
//            while(arr[v]!=null)
//                System.out.println(arr[v++]);
//            String S=br.readLine();
//            strs[0] = br.readLine();
//            strs[1] = br.readLine();
//            String[] sub_string=new String[S.length()];
//            for(int i=0;i<S.length();i++)
//            {
//                sub_string[i]=S.substring(i);
//            }
//            String con=strs[0]+strs[1];
//            int count=0;
//            for(int i=sub_string.length-1;i>=0;i--)
//            {
//                if(con.length()>sub_string[i].length())
//                    continue;
//                else
//                {
//                    int frq=0;
//                    for(int j=0;j<con.length();j++)
//                    {
//                        if(con.charAt(j)==sub_string[i].charAt(j))
//                            frq++;
//                    }
//                    if(frq==con.length())
//                        count++;
//                }
//            }
//            System.out.println(count);
    }
    public static void main(String[] args) throws IOException
    {
//        try
//        {
//            while (true) fff();
//        } catch (Exception e) 
//        {
//        }
        Scanner sc=new Scanner(System.in);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String arr[]=new String[100000];
            for(int q=0;q<6;q++)
                arr[q]=br.readLine();
            int v=0;
            while(arr[v]!=null)
                System.out.println(arr[v++]);
    }
}
