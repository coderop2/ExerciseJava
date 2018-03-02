/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication87;
import java.util.Arrays;
/**
 *
 * @author dayalkhandelwal
 */
public class JavaApplication87 {

public static void main(String args[])
{
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    fun(Arrays.copyOfRange(arr, 2, 3));
}

public static void fun(int a[])
{
    for (int i = 0; i < a.length; i++) {
        System.out.printf("%d ", a[i]);
    }
}
}
