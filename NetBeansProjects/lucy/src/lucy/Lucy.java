/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy;
import java.io.*;
import java.util.Arrays;
class Lucy
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	int test;
        	test = Integer.parseInt(br.readLine());
        
       		while( test-- > 0) {
            		int n = Integer.parseInt(br.readLine());
            		players p[] = new players[n];
            		for (int i=0;i<n;i++) {
                		String s[] = br.readLine().split(" ");
                		p[i] = new players(s[0], Integer.parseInt(s[1]));
            		}
            		Arrays.sort(p);
            		int min = p[0].pnumber;
            		int index = 0;
            		int count = 1;
            		for (int i=1;i<n;i++) {
                		if (min == p[i].pnumber) {
                    		count++;
                		}
                		else {
                    			if (count > 1) {
                        			min = p[i].pnumber;
                        			count = 1;
                        			index = i;
                    			}
                    			else 
                        			break;
                		}
            		}
            		if(count == 1)
                		System.out.println(p[index].pname);
            		else
                		System.out.println("Nobody wins.");
        	}
    }
	
	static class players implements Comparable<players> {
		String pname;
		int pnumber;
		
		players( String pname, int pnumber) {
			this.pname = pname;
			this.pnumber = pnumber;
		}
		
		@Override
		public int compareTo(players p) {
			if ( this.pnumber < p.pnumber) {
				return -1;
			}
			else if ( this.pnumber > p.pnumber) {
				return 1;
			}
			else 
				return 0;
		}
		
	}
}