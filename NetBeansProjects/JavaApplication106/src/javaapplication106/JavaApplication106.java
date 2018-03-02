package javaapplication106;

import java.io.*;
import java.util.*;
public class JavaApplication106 {
    static long bit[];
    static class node {
        int val,ind;
        public node(int val,int ind){
            this.val=val;this.ind=ind;
        }
        
    }
    public static void main(String args[]) throws Exception {
        
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(b.readLine());
        bit=new long[300000];
        node ar[]=new node[n];
        node br[]=new node[n];
        StringTokenizer st=new StringTokenizer(b.readLine());
        for(int i=0;i<n;i++){
            ar[i]=new node(Integer.parseInt(st.nextToken()),i+1);
        }
        st=new StringTokenizer(b.readLine());
        for(int i=0;i<n;i++){
            br[i]=new node(Integer.parseInt(st.nextToken()),i+1);
        }
        Arrays.sort(ar);
        Arrays.sort(br);
//        for(int i=0;i<n;i++){
//            System.out.print(ar[i].val+" "+ar[i].ind+" ");
//        }
//        System.out.println();
//        for(int i=0;i<n;i++){
//            System.out.print(br[i].val+" "+br[i].ind+" ");
//        }
        int k=0;
        long ans=0;
        for(int i=0;i<n;i++){
            
            while(k<n && ar[k].val>br[i].val){
                update(ar[k].ind);k++;
            }
            ans+=sum(br[i].ind-1);
        }
        System.out.println(ans);
    }
    static void update(int ind){
        while(ind<300000){
            bit[ind]++;
            ind+=(ind&(-ind));
        }
    }
    static long sum(int ind){
        long s=0;
        while(ind>0){
            s+=bit[ind];
            ind-=(ind&(-ind));
        }
        return s;
    }
}
