/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;

import java.util.*;
import java.util.Scanner;


/**
 *
 * @author dayalkhandelwal
 */
public class JavaApplication66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Queue<Integer> harryBag=new ArrayDeque<>();
        for(int i=0;i<N;i++)
            harryBag.offer(sc.nextInt());
        int x=sc.nextInt();
        int X=sc.nextInt();
        Stack<Integer> monksBag=new Stack<>();
        for(int i=0;i<x;i++)
        {
            if(sc.next().equals("Harry")) {
                if(harryBag.isEmpty()) {
                    System.out.println("-1");
                    return;
                }else{
                    int coinValue = harryBag.poll();
                    monksBag.push(coinValue);
                    X -= coinValue;
                }
                if(X == 0) {
                    System.out.println(monksBag.size());
                    return;
                }
            }else{
                X += monksBag.pop();
            }
        }
        System.out.println("-1");
        }

    
}
