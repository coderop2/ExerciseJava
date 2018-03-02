package javaapplication47;
import java.util.*;
public class JavaApplication47 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLs Enter the date of the month");
        int dd=sc.nextInt();
        System.out.println("Pls enter the mounth");
        int mm=sc.nextInt();
        System.out.println("Pls enter the 2 initial digits of the year");
        int yy=sc.nextInt();
        System.out.println("Pls enter the 2 final digits of the year");
        int YY=sc.nextInt();
        for(int i=0;i<4;i++)
        {
            System.out.print("1");
            for(int j=0;j<4;j++)
                System.out.print(" "+"*"+" ");
            System.out.println();
        }
    }
}
