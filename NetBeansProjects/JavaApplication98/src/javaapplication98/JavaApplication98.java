package javaapplication98;
import java.util.*;

public class JavaApplication98 
{
    int largest,a;
    void max_heapihy(int arr[], int i, int N)
    {
        int left = 2*i;                   
        int right = 2*i +1;           
        if(left<= N && arr[left] > arr[i] )
              largest = left;
        else
             largest = i;
        if(right <= N && arr[right] > arr[largest] )
            largest = right;
        if(largest != i )
        {
            a=arr[i];
            arr[i]=arr[largest];
            arr[largest]=a;
            max_heapihy (arr, largest,N);
        } 
    }
    public static void main(String[] args) 
    {
        int arr[]={0,1,4,3,7,8,9,10};
        
        for(int i=1;i<9;i++)
        {
            new JavaApplication98().max_heapihy(arr, i, 7);
        }
        for(int i=0;i<=7;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
