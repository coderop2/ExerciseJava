/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication110;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author dayalkhandelwal
 */
public class JavaApplication110 {
    public static int[] suffixArray(final CharSequence str) 
    {
        int n = str.length();
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++)
            order[i] = n - 1 - i;
        for(int i=0;i<order.length;i++)
            System.out.println("order "+order[i]);
        Arrays.sort(order, new Comparator<Integer>() 
        {
            public int compare(Integer o1, Integer o2) 
            {
                System.out.println("bj "+(str.charAt(o1) - str.charAt(o2)));
                return str.charAt(o1) - str.charAt(o2);
            }
        });
//        int[] sa = new int[n];
//        int[] rank = new int[n];
//        for (int i = 0; i < n; i++) 
//        {
//            sa[i] = order[i];
//            rank[i] = str.charAt(i);
//        }
//        for(int i=0;i<rank.length;i++)
//            System.out.println("r"+sa[i]);
//        for (int len = 1; len < n; len *= 2) 
//        {
//            int[] r = rank.clone();
//            for (int i = 0; i < n; i++) 
//            {
//                rank[sa[i]] = i > 0 && r[sa[i - 1]] == r[sa[i]] && sa[i - 1] + len < n && r[sa[i - 1] + len / 2] == r[sa[i] + len / 2] ? rank[sa[i - 1]] : i;
//            }
//            int[] cnt = new int[n];
//            for (int i = 0; i < n; i++)
//                cnt[i] = i;
//            int[] s = sa.clone();
//            for (int i = 0; i < n; i++) 
//            {
//                int s1 = s[i] - len;
//                if (s1 >= 0)
//                    sa[cnt[rank[s1]]++] = s1;
//            }
//        }
        return null;
    }
    public static void main(String[] args) {
        String s="abcde";
        int[] sa = suffixArray(s);
        for(int i=0;i<s.length();i++)
            System.out.println(sa[i]);
    }
    
}
