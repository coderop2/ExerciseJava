package javaapplication102;
/**
 * 
 * import java.util.Scanner;
 
class LazySegmentTree
{
    private int segmentArray[];
    private int lazyArray[];
 
    LazySegmentTree(int array[],int size)
    {
        int x = (int) (Math.ceil(Math.log(size) / Math.log(2)));
        int max_size = 2 * (int) Math.pow(2, x) - 1;
 
        segmentArray = new int[max_size];
        lazyArray = new int[max_size];
 
        constructSTUtil(array,0,size-1,0);
    }
 
    private void constructSTUtil(int array[],int start,int end,int pos)
    {
        if(start > end)
            return;
        if(start == end)
        {
            segmentArray[pos] = array[start];
        }
        else
        {
            int mid = (start + end)/2;
            constructSTUtil(array,start,mid,2*pos+1);
            constructSTUtil(array,mid+1,end,2*pos+2);
            segmentArray[pos] = Math.min(segmentArray[2*pos+1] , segmentArray[2*pos+2]);
        }
    }
 
    public void updateRange(int array[],int size,int value,int diff)
    {
        updateRangeUtil(array,0,0,size-1,value,diff);
    }
 
    private void updateRangeUtil(int array[],int pos,int start,int end,int value,int diff)
    {
        if(lazyArray[pos] != 0)
        {
            segmentArray[pos] -= lazyArray[pos];
            if(start != end)
            {
                lazyArray[2*pos+1] += lazyArray[pos];
                lazyArray[2*pos+2] += lazyArray[pos];
            }
            lazyArray[pos] = 0;
        }
 
        if(start == end)
        {
            array[start] = segmentArray[pos];
            if(array[start] > value)
            {
                array[start] -= 1;
                segmentArray[pos] = array[start];
            }
            return;
        }
 
        if(segmentArray[pos] > value)
        {
            segmentArray[pos] -= 1;
            lazyArray[2*pos+1] += 1;
            lazyArray[2*pos+2] += 1;
            return;
        }
 
        int mid = (start + end)/2;
        updateRangeUtil(array,2*pos+1,start,mid,value,diff);
        updateRangeUtil(array,2*pos+2,mid+1,end,value,diff);
        segmentArray[pos] = Math.min(segmentArray[2*pos+1] , segmentArray[2*pos+2]);
    }
 
    public void flush(int array[],int pos, int start, int end)
    {
        if(lazyArray[pos] != 0)
        {
            segmentArray[pos] -= lazyArray[pos];
            if(start != end)
            {
              lazyArray[2*pos+1] += lazyArray[pos];
              lazyArray[2*pos+2] += lazyArray[pos];
            }
            lazyArray[pos] = 0;
        }
 
        if(start == end)
        {
            array[start] = segmentArray[pos];
            return;
        }
 
        int mid = (start+end)/2;
        flush(array,2*pos+1,start,mid);
        flush(array,2*pos+2,mid+1,end);
    }
}
 
 
 
public class Main
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       int size = s.nextInt();
 
       int array[] = new int[size];
 
       for(int i = 0;i < size;i++)
       {
         array[i] = s.nextInt();
       }
 
       LazySegmentTree lazySegmentTree = new LazySegmentTree(array,size);
 
       int queries = s.nextInt();
       while(queries --> 0)
       {
           int value = s.nextInt();
           lazySegmentTree.updateRange(array,size,value,1);
       }
 
       lazySegmentTree.flush(array,0,0,size-1);
 
       for(int i = 0;i < size;i++)
       {
           System.out.print(array[i] + " ");
       }
    }
 }
 */
/**
 *
 * @author dayalkhandelwal
 */
public class JavaApplication102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(0>>>1);
    }
    
}
