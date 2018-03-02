package javaapplication67;
import java.util.Scanner;
class Stack<E>
{
    public E arr[];
    public int len,top,size;
    Stack(int n)
    {
        size=n;
        arr=(E[]) new Object[n];
        len=0;
        top=-1;
    }
    void push(E element)
    {
        if(top+1>=size)
            System.out.println("sry");
        else
        {
            len++;
            arr[++top]=element;
        }
    }
    boolean isempty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    E pop()
    {
        if(isempty())
        {
            return arr[0]=null;
        }
        else
        {
            len--;
        return arr[top--];
        }
    }
    E peek()
    {
        if(isempty())
            return null;
        else return arr[top];
    }
    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
public class JavaApplication67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter the number");
        int n=sc.nextInt();
        Stack<Integer> ob=new Stack<>(n);
        char ch;
        do{
        x=sc.nextInt();
        switch(x)
        {
            case 1:
                int a=sc.nextInt();
                ob.push(a);
                break;
            case 2:
                System.out.println(ob.pop());
                System.out.println(ob.len);
                System.out.println(ob.top);
                break;
            case 3:
                System.out.println(ob.peek());
                System.out.println(ob.len);
                System.out.println(ob.top);
                break;
            case 4:
                System.out.println(ob.isempty());
                System.out.println(ob.len);
                System.out.println(ob.top);
                break;
            case 5:
                ob.display();
                break;
        }
        ch = sc.next().charAt(0);
        }while (ch == 'Y'|| ch == 'y');
    }
    
}
