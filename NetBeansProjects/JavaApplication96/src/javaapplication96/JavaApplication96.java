package javaapplication96;

/**
 *
 * @author dayalkhandelwal
 */
public class JavaApplication96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int levels[]=new int[262145];
        int lvlc=1,lvlc1=1;
        for(int i=1;i<=18;i++)
        {
            int freq=0;
            while(freq<lvlc1)
            {
                levels[lvlc++]=i;
                freq++;
            }
            lvlc1=lvlc1*2;
        }
       levels[262144] = 19;

        for(int i=262144;i>=1;i--)
        {
            System.out.print(levels[i]+" ");
        }
    }
    
}
