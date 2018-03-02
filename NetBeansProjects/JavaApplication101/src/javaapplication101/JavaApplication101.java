package javaapplication101;

import java.util.*;

class node {
            node[] check = new node[26];
            int weight = 0;
 
        }
public class JavaApplication101 
{
    void addData(String s, node parent_node, int weight) {
            node current_node = parent_node;
            for (int i = 0; i < s.length(); i++) {
                if (current_node.check[s.charAt(i) - 'a'] == null) {
                    current_node.check[s.charAt(i) - 'a'] = new node();
 
                }
                if (current_node.weight < weight) current_node.weight = weight;
 
                current_node = current_node.check[s.charAt(i) - 'a'];
            }
        }
 
        int queryData(node parent_node, String query_String) {
            node current_node = parent_node;
            for (int i = 0; i < query_String.length(); i++) {
                if (current_node.check[query_String.charAt(i) - 'a'] == null) return -1;
                current_node = current_node.check[query_String.charAt(i) - 'a'];
            }
            return current_node.weight;
        }
 
        public void solve(int testNumber, Scanner in,JavaApplication101 ob) {
            int data = in.nextInt();
            int query = in.nextInt();
            node parent_node = new node();
            while (data-- > 0) {
                ob.addData(in.next(), parent_node, in.nextInt());
            }
            while (query-- > 0) {
                System.out.println(ob.queryData(parent_node, in.nextLine()));
            }
        }
    public static void main(String[] args) 
    {
        JavaApplication101 ob=new JavaApplication101();
        Scanner in=new Scanner(System.in);
        ob.solve(1, in, ob);
    }
}
