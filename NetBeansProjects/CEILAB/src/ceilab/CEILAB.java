package ceilab;
import java.util.Scanner;
public class CEILAB {
    static int[] lengthdigit(int a)
    {
        int[] arr_digits=new int[6];
        for(int i=0;i<=5;i++)
        {
            int b=a%10;
            a=a/10;
            arr_digits[i]=b;
        }
        return arr_digits;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
//        int A=sc.nextInt();
//        int B=sc.nextInt();
//        int[] arr_digits=lengthdigit(A);
        System.out.println(1011%100);
    }    
}
