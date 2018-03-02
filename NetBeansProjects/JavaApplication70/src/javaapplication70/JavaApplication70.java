package javaapplication70;

import java.util.Scanner;

class Stack<E>
{
    E arr[];
    int top,len,size;
    Stack(int n)
    {
        size=n;
        top=-1;
        len=0;
        arr=(E[])new Object[size];
    }
    void push(E element)
    {
        if(top+1==size)
            System.out.println("Nothing can be added");
        else
        {
            len++;
            arr[++top]=element;
        }
    }
    E pop()
    {
        if(isEmpty())
        {
            System.out.println("The Stack in empty");
            return null;
        }
        return arr[top--];
    }
    boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    int index(E ar)
    {
        if(ar==null)
            System.out.println("there is no element to be searched");
        else
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==ar)
                    return i;
            }
        }
        return 0;
    }
    void display()
    {
        if(top==-1)
            System.out.println("Nothing to display");
        else
            for(int i=0;i<arr.length;i++)
                System.out.println(arr[i]);
    }
    E peek()
    {
        if(isEmpty())
            return null;
        else
            return arr[top];
    }
}
public class JavaApplication70 
{
    public static void main(String[] args) 
    {
        int count,pop;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr2[];
        int number_of_towers;
        loop3:
        for(int y=0;y<t;y++)
        {
            number_of_towers=sc.nextInt();
            int arr1[]=new int[number_of_towers+5];
            loop1:
            for(int i=0;i<number_of_towers;i++)
            {
                arr1[i]=sc.nextInt();
                if(arr1[i]>=0)
                    continue loop1;
                else
                {
                    System.err.println("pls input valid tower heights");
                    continue loop3;
                }
            }
            arr2=new int[number_of_towers];
            loop:
            for(int i=number_of_towers-1;i>0;i--)
            {
                count=1;
                int j=i-1;
                pop=arr1[i];
                while(pop>=arr1[j])
                {
                    count++;
                    if(j==0)
                        break;
                    j--;
                    
                }
                arr2[i]=count;
            }
            arr2[0]=1;
            for(int i=0;i<number_of_towers;i++)
        System.out.println(arr2[i]);
        }
        System.out.println();
    }
}