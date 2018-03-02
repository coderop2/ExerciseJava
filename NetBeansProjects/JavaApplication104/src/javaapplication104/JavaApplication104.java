
package javaapplication104;

import java.util.*;

public class JavaApplication104 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int T = sc.nextInt(); T >= 1; T--) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] stack = new int[n + 1];
            int sp = 0;
            long ret = 0;
            for (int i = 0; i < n; i++) {
                boolean done = false;
                while (sp > 0 && stack[sp - 1] < a[i]) {
                    sp--;
                    if (!done) {
                        ret += a[i];
                        done = true;
                    }
                }
                stack[sp++] = a[i];
            }
            sp = 0;
            for (int i = n - 1; i >= 0; i--) {
                boolean done = false;
                while (sp > 0 && stack[sp - 1] < a[i]) {
                    sp--;
                    if (!done) {
                        ret += a[i];
                        done = true;
                    }
                }
                stack[sp++] = a[i];
            }
            System.out.println(ret);
        }
    }

}
