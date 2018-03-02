/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication103;

import java.util.*;

public class JavaApplication103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int rename = 0;long sum = 0;
            int N = sc.nextInt();
            int arr[] = new int[N];
            int[] stack = new int[N + 1];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                boolean done = false;
                while (rename > 0 && stack[rename - 1] < arr[i]) {
                    rename--;
                    if (!done) {
                        sum += arr[i];
                        done = true;
                    }
                }
                stack[rename++] = arr[i];
            }
            rename = 0;
            for (int i = N - 1; i >= 0; i--) {
                boolean bool = false;
                while (rename > 0 && stack[rename - 1] < arr[i]) {
                    rename--;
                    if (!bool) {
                        sum += arr[i];
                        bool = true;
                    }
                }
                stack[rename++] = arr[i];
            }
            System.out.println(sum);
        }
    }
}
