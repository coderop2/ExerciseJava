package javaapplication107;
import java.util.Arrays;

public class JavaApplication107 
{
    public static String lrs(String s){
        int N = s.length();
        String[] suffixes = new String[N];
        
        System.out.println("Suffixes: ");
        for(int i=0;i<suffixes.length;++i){
            suffixes[i] = s.substring(i);
            System.out.println(suffixes[i]);
        }
        
        System.out.println();
        Arrays.sort(suffixes);
        System.out.println("Sorted Suffixes: ");
        for(String sss:suffixes)System.out.println(sss);
        
        String lrs = "";
        
        for(int i=0;i<N-1;++i){
            int len = lcp(suffixes[i], suffixes[i+1]);
            if(len>=0 && len>lrs.length()){
                lrs = suffixes[i].substring(0, len+1);
            }
        }
        return lrs;        
    }
    
    public static int lcp(String s, String ss){
        int i=0;
        for(;i<s.length();++i){
            if(s.charAt(i)!=ss.charAt(i))break;
        }
        return i-1;
    }
    
    public static void main(String[] args){
        String s = "nabraxyabrae";
        
        //Include overlapping substrings
        System.out.println("\n\nLongest Repeated Substring -> "+lrs(s));
    }   
}
