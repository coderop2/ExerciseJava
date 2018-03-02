package javaapplication99;
import java.util.*;

public class JavaApplication99
{
    int[] insert(int[] arr,int element,int index)
    {
        if(arr[index]==0)
        {
            arr[index]=element;
            return arr;
        }
        else
        {
            if(element>arr[index])
                insert(arr,element,2*index+2);
            else
                insert(arr,element,2*index+1);
            return arr;
        }
    }
    public static void main(String[] args) 
    {
        JavaApplication99 ob=new JavaApplication99();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[131072];
        for(int i=0;i<N;i++)
        {
            int a=sc.nextInt();
            arr=ob.insert(arr, a,0);
        }
        int X=sc.nextInt();
        int Y=sc.nextInt();
        if(X<arr[0]&&Y>arr[0])
        {
            
        }
        else if(X>arr[0]&&Y>arr[0])
        {
            
        }
        else if(X<arr[0]&&Y<arr[0])
        {
            
        }
        else if((X>arr[0]&&Y<arr[0])&&(X<arr[0]&&Y==arr[0]))
            System.out.print(arr[0]);
        else
            System.out.println(X);
    }
}
