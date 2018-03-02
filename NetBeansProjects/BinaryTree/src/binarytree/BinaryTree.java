/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author dayalkhandelwal
 */
class Node
{
    Node right;
    Node left;
    int key;
    Node(int item)
    {
        this.key=item;
    }
    
}
public class BinaryTree {
    void fillbinarytree(int a[], HashMap<Integer, Node> hm)
    {Node root=new Node(a[0]);
        if(hm.isEmpty())
            hm.put(a[0], root);
        for(int i=1;i<=a.length;i++)
        {
            if(a[i]>a[i-1])
                populatefromright();
            else if(a)
                
        }
    }
    void populatefromright()
    {
        
    }
    void populatefromleft()
    {
        
    }
    public static void main(String[] args) {
        Map<Integer,Node> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        if(a<=10&&a>=0);
        else
            System.exit(0);
        for(int i=0;i<=a;i++)
        {
            arr[i]=sc.nextInt();
        }
        BinaryTree ob=new BinaryTree();
        ob.fillbinarytree(arr, hm);
        
    }
    
}
