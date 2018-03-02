

package Calculator;
import operations.*;
import java.io.IOException;
public class calculator 
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("If you want to operate arithematic operations on the two numbers then proceed:");
        arithematic ob=new arithematic();
        ob.getDetails();
        ob.displayDetails();
        ob.arithematic_operation();
    }
    
}
