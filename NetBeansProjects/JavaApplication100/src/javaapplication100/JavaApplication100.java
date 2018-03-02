
package javaapplication100;
import java.util.*;
public class JavaApplication100 {
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        while(n-->0){
            String s=in.next();
            if(s.equals("CountHigh")){
                if(map.isEmpty()) System.out.println(-1);
                else System.out.println(map.get(map.lastKey()));
            }
            else if(s.equals("CountLow")){
                if(map.isEmpty()) System.out.println(-1);
                else System.out.println(map.get(map.firstKey()));
            }
            else if(s.equals("Diff")){
                if(map.size()>=2){
                    int t1=map.lastKey();
                    int t2=map.firstKey();
                    System.out.println(t1-t2);
                    if(map.get(t1)==1) map.remove(t1);
                    else map.put(t1,map.get(t1)-1);
                    if(map.get(t2)==1) map.remove(t2);
                    else map.put(t2,map.get(t2)-1);
                }
                else if(map.size()==1){
                    System.out.println(0);
                    int t1=map.firstKey();
                    if(map.get(t1)==1) map.remove(t1);
                    else map.put(t1,map.get(t1)-1);
                }
                else System.out.println(-1);
            }
            else{
                int x=in.nextInt();
                if(map.containsKey(x)) map.put(x, map.get(x)+1);
                else map.put(x, 1);
            }
        }
    }
    
}
