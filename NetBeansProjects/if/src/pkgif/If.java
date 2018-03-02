package pkgif;
public class If
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the first number");
        x=sc.nextInt();
        System.out.println("Enter the second number");
        y=sc.nextInt();
        if(x>y)
        {
            System.out.println("Keya is a bad girl");
        }
        else
        {
            System.out.println("Harshit is a good boy");
        }
    }
    
}
