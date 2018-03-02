/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twod;

/**
 *
 * @author dayalkhandelwal
 */
public class TwoD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int w[][][]=new int[4][5][6];
        int k=0;
        for(int i=0;i<4;i++)
            for(int j=0;j<5;j++)
                for(int x=0;x<6;x++)
                    w[i][j][x]=i*j*x;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                for(int x=0;x<6;x++)
                    System.out.print(" "+w[i][j][x]);
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
