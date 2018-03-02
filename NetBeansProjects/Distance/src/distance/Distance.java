package distance;
import java.util.Scanner;
public class Distance 
{
    float dist;
    int t, a, v;
    public void getDetails()
    {    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the Time taken by the driver");
        t=sc.nextInt();
        System.out.println("Enter the acceleration of the driver:");
        a=sc.nextInt();
        System.out.println("Enter the velocity of the driver:");
        v=sc.nextInt();
    }
    public void cal()
    {
        dist=v*t+(a*(t^2))/2;
        System.out.println("The distance trevelled by the driver is="+dist);
    }
    public static void main(String[] args)
    {
        Distance ob=new Distance();
        ob.getDetails();
        ob.cal();
    }
    
}
