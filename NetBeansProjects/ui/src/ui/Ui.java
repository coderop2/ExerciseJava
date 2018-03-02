/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.util.*;
public class Ui {

   public static void main(String args[])
   {
       ArrayList a=new ArrayList();
       a.add(114);
       a.add(112);
       a.add('a');
       a.add('g');
       System.out.println(a);
       System.out.println(a.get(3));
       Iterator i=a.iterator();
       while(i.hasNext())
       {
           System.out.println(i.next());
       }
   }
}
