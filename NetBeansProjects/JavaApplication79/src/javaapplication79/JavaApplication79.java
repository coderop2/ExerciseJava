/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication79;

import java.util.Scanner;

/**
 *
 * @author dayalkhandelwal
 */
public class JavaApplication79 {
    boolean cheaku(char ch[])
    {
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='u')
                return true;
            else 
                return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String s=sc.nextLine().toLowerCase();
            char ch[]=s.toCharArray();
            JavaApplication79 ob=new JavaApplication79();
            System.out.println(ob.cheaku(ch));
    }
    
}
