/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomclass;
import java.util.*;

/**
 *
 * @author dayalkhandelwal
 */
public class Randomclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String str = "Hello World";
      String anotherString = "hello world";
      Object objStr = str;

      System.out.println( str.compareTo(anotherString) );
      System.out.println( str.compareToIgnoreCase(anotherString) );
      System.out.println( str.compareTo(objStr.toString()));
    }
    
}
