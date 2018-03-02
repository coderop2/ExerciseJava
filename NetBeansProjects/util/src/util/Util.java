/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.util.*;
public class Util
{
    Scanner sc=new Scanner(System.in);
    int n;
    void displayDetails()
    {
        System.out.println("Enter your choice of number for which squre would be produced by the computer");
        System.out.println("1. Integer");
        System.out.println("2. Float");
        System.out.println("3. Double");
        System.out.println("4. Charcter");
        n=sc.nextInt();
    }
    void getDetails()
    {
        switch(n)
        {
            case 1:
                System.out.println("you have choosen integer");
                System.out.println("enter the integer");
                int q=sc.nextInt();
                int Square=q*q;
                System.out.println("the squre is"+Square);
            case 2:
                System.out.println("you have choosen float");
                System.out.println("enter the ifloat");
                float r=sc.nextFloat();
                float Squar=r*r;
                System.out.println("the squre is"+Squar);
            case 3:
                System.out.println("you have choosen double");
                System.out.println("enter the double");
                double t=sc.nextDouble();
                double Squa=t*t;
                System.out.println("the squre is"+Squa);
            case 4:
                System.out.println("you have choosen character");
                System.out.println("enter the charater");
                char c = sc.next(".").charAt(0);
                System.out.println(c+" "+c);
            default:
                System.out.println("pls enter a valid input");
                System.out.println("That would be 1 or 2 or 3 or 4");
        }
    }
    public static void main(String[] args)
    {
        Util a=new Util();
        a.displayDetails();
        a.getDetails();
    }
}