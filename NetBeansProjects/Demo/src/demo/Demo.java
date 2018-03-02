/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
class Demo
{
   static void throwMethod() throws NullPointerException
   {
       System.out.println ("Inside throwMethod");
       throw new NullPointerException ("Demo"); 
   } 
   public static void main(String args[])
   {
       try
       {
          throwMethod();
       }
       catch (NullPointerException exp)
       {
          System.out.println ("The exception get caught" +exp);
       }
    }
}
