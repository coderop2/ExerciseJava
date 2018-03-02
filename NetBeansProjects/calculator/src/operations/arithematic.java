
package operations;
import java.io.*;
public class arithematic 
{
    public int i,j;
    public void getDetails()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers You want to enter");
        System.out.println("Enter the first number:");
        i=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number:");
        j=Integer.parseInt(br.readLine());
    }
    public void displayDetails()
    {
        System.out.println("The First number your entered is:"+i);
        System.out.println("The Second number your entered is:"+j);
    }
    public void arithematic_operation()
    {
        int add=i+j;
        System.out.println("the sum is-"+" "+add);
    }
}
