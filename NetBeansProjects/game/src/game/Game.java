package game;
import java.util.Scanner;
public class Game 
{
    public void showMenu()
    {
        int option;
        Scanner sc=new Scanner(System.in);
        System.out.println("---------MENU---------");
        System.out.println("1. Play");
        System.out.println("2. Instructions");
        System.out.println("3. Exit");
        System.out.println("Choose one of the above options: ");
        option=sc.nextInt();
    }
    public static void main(String[] args)   
    {
        Game ob=new Game();
        ob.showMenu();
    }
    
}
