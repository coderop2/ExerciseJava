package javaapplication108;
import java.util.*;

public class JavaApplication108 
{
    static class sub_strings
    {
        String substring12;
        int index;
        sub_strings(String s, int in)
        {
            substring12=s;
            index=in;
        }
    }
    public static void main(String[] args) 
    {
        for(int x=0;x<3;x++)
        {
            Scanner sc=new Scanner(System.in);
            String S=sc.next();
            String T1=sc.next();
            String T2=sc.next();
            sub_strings[] sub_string=new sub_strings[S.length()];
            for(int i=0;i<S.length();i++)
            {
                sub_string[i]=new sub_strings(S.substring(i),i);
            }
            String con=T1+T2;
            int count=0;
//            for(int i=0;i<S.length();i++)
//            {
//                System.out.println(sub_string[i].substring12+" ");
//                System.out.print(sub_string[i].index);
//            }
//            ||con.length()>(sub_string[i].substring.length()-sub_string[i-1].substring12.length())
            for(int i=sub_string.length-1;i>=0;i--)
            {
//                System.out.println("substring "+sub_string[i].substring12);
                if(con.length()>sub_string[i].substring12.length())
                    continue;
                else
                {
                    int frq=0;
                    for(int j=0;j<con.length();j++)
                    {
//                        System.out.println("inside "+sub_string[i].substring12+" "+sub_string[i].substring12.charAt(j));
                        if(con.charAt(j)==sub_string[i].substring12.charAt(j))
                            frq++;
                    }
//                    System.out.println("freq "+frq);
                    if(frq==con.length())
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
