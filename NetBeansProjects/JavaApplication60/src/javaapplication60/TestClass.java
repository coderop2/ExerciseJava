package javaapplication60;

import java.util.Scanner;

public class TestClass {
    void check(int a[])
            {
                int count=0,min;
                if(a.length==1)
                {
                    System.out.println(1);
                }
                else
                {
                    if(a[0]>a[1])
                    {
                        count=count+2;
                        min=a[1];
                        for(int i=2;i<a.length;i++)
                        {int newmin;
                            if(a[i]<min)
                            {
                                newmin=a[i];
                                min=newmin;
                                count++;
                            }
                        }
                    }
                    else
                    {
                        count++;
                        min=a[0];
                        for(int i=2;i<a.length;i++)
                        {int newmin;
                            if(a[i]<min)
                            {
                                newmin=a[i];
                                min=newmin;
                                count++;
                            }
                        }
                    }
                    System.out.println(count);
                }
            }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        TestClass ob=new TestClass();
        loop1:
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            String s="Pls input valid numbers";
            int arr[]=new int[b];
            for(int j=0;j<b;j++)
            {
                arr[j]=sc.nextInt();
                if(arr[j]<0)
                {
                System.err.print(s);
                continue loop1;
                }
            }
            ob.check(arr);
        }
    }
    
}
