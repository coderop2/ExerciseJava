/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication64;

import java.util.Scanner;

/**
 *
 * @author dayalkhandelwal
 */
public class JavaApplication64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
            String ch[][]=new String[N][M];
            for(int x=0;x<N;N++)
            {
                for(int y=0;y<M;y++)
                {
                    ch[x][y]=sc.nextLine();
                    
                }
            }
            for(int x=0;x<N;N++)
            {
                for(int y=0;y<M;y++)
                {
                    System.out.print(ch[x][y]+" ");
                }
                System.out.println();
            }
            
        
    
}
}