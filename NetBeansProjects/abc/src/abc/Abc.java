package abc;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
class Abc 
{
   static class Vertex
        {
            List<Pair> adj=new ArrayList();
        
        }
   static class Pair 
        {
            int id;
            long wt;
            Pair(int x,long y)
            {
                this.id=x;
                this.wt=y;
            }
        }
static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt(),k=sc.nextInt();
            long x=sc.nextLong();
            int m=sc.nextInt(),s=sc.nextInt();
            Vertex v[]=new Vertex[n];
            for(int i=0;i<n;i++)
                v[i]=new Vertex();
            for(int i=0;i<m;i++)
            {
                        int u1=sc.nextInt(),v1=sc.nextInt();
                        long w=sc.nextLong();
                v[(u1-1)].adj.add(new Pair((v1-1),w));
                v[(v1-1)].adj.add(new Pair((u1-1),w));
            }
            dijkstra(s-1,n,v,x,k);
        }
        pw.print(sb);
        pw.close();
    }
    static void dijkstra(int src,int n,Vertex v[],long x,int k)
    {
        long dis[]=new long[n];
        for(int i=0;i<n;i++)
            dis[i]=Long.MAX_VALUE;
        dis[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return (int)(o1.wt - o2.wt);
            }
        });
        pq.add(new Pair(src,0));
        int nn=0;
        while(!pq.isEmpty())
        {
            int u=pq.peek().id;
            pq.remove();
               if (u < k && nn == 0) {
                nn = 1;
                for (int i = 0; i < k; i++) {
                    if (i == u) continue;
                    if (dis[i] > dis[u] + x) {
                        dis[i] = dis[u] + x;
                        pq.add(new Pair(i, dis[i]));
                    }
                }
               }
            for(int i=0;i<v[u].adj.size();i++)
            {
                if(dis[v[u].adj.get(i).id]>(dis[u]+v[u].adj.get(i).wt))
                {
                    dis[v[u].adj.get(i).id]=dis[u]+v[u].adj.get(i).wt;
                    pq.add(new Pair(v[u].adj.get(i).id,dis[v[u].adj.get(i).id]));
                }
            }
        }
            for (int i = 0; i < n; i++) {
            sb.append(dis[i]).append(" ");
        }
        sb.append('\n');
    }
} 