package solution;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String S = scan.nextLine();
         int A = scan.nextInt();
         scan.close();
         int index = S.length()-A+1;
         String[] elements = new String[index];
        
        //substring String
         for(int i=0; i<index; i++){
             elements[i] = S.substring(i,i+A);
         }
        
         //smalest 
         String minElement = elements[0];
         for(int i=1; i<index; i++){
             int comp1 = minElement.compareTo(elements[i]);
             if(comp1>0){
            	 minElement = elements[i];
             }
             
         }
         //largest 
         String maxElement = elements[0];
         for(int i=1; i<index; i++){
             int comp = maxElement.compareTo(elements[i]);
             if(comp<0){
            	 maxElement = elements[i];
             }
         }
         
         System.out.println(minElement);
         System.out.println(maxElement);
    }
}
