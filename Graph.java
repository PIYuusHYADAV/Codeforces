import java.util.*;
public class Graph {
    private static int par(int x,int[] parent)
    {
        if(x == parent[x]) return parent[x];
        return parent[x] = par(parent[x], parent); 
    }
    private static void union(int x, int y,int[] parent)
    {
        int parA = par(x,parent);
        int parB = par(y,parent);
        if(parA == parB) return;
        else parent[parB] = parA;
    }
    private static int[] checkParent(int x, int y,int[] parent)
    {
        int parA = par(x,parent);
        int parB = par(y,parent);
        if(parA == parB) return new int[]{-1,-1};
        else return new int[]{x, y};
    }
    private static int checkIndependent(int[] parent)
    {
        int count = 0;
        for(int i = 1; i < parent.length; i++)
        {
            if(parent[i] == i) count++;
        }
        return count-1;
    }
    private static void UniqueNodes(int[] par, HashSet<Long> hm, int n)
    {
        for(int i = 1; i < par.length; i++)
        {
            for(int j = i+1; j < par.length; j++)
            {
                int[] ans = checkParent(i, j, par);
                if(ans[0] == -1) continue; 
                hm.add((long) ans[0] * (n+1) + ans[1]);
            }
        }
    }
    private static HashSet<Long> ComputeNodes(int[] par, HashSet<Long> hm, int n)
    {
        HashSet<Long> set = new HashSet<>();
        for(int i = 1; i < par.length; i++)
        {
            for(int j = i+1; j < par.length; j++)
            {
                long key = (long) i * (n+1) + j;
                if(!hm.contains(key)) continue;      
                int[] ans = checkParent(i, j, par);
                if(ans[0] == -1) continue;           
                set.add(key);
            }
        }
        return set;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfNodes = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int[] parA = new int[numberOfNodes+1];
        int[] parB = new int[numberOfNodes+1];
        for(int i = 1; i <= numberOfNodes; i++)
        {
            parA[i] = i;
            parB[i] = i;
        }
        for(int i = 0; i < m1; i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            union(u,v,parA);
        }
        for(int i = 0; i < m2; i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            union(u,v,parB);
        }
        int graph1Edges = checkIndependent(parA);
        int graph2Edges = checkIndependent(parB);
        int totalEdges = Math.min(graph1Edges,graph2Edges);
        if(totalEdges == 0){ System.out.println(0); return;}
        HashSet<Long> hm = new HashSet<>();
        UniqueNodes(parA,hm,numberOfNodes);
        HashSet<Long> set = ComputeNodes(parB, hm,numberOfNodes);
        List<Long> list = new ArrayList<>(set);
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int found = 0;
        while(found < totalEdges && i < list.size())
        {
            long key = list.get(i);
            int a = (int)(key / (numberOfNodes+1));
            int b = (int)(key % (numberOfNodes+1));

            int[] chkA = checkParent(a, b, parA);
            int[] chkB = checkParent(a, b, parB);
            if(chkA[0] == -1 || chkB[0] == -1)
            {
                i++;
                continue;
            }

            union(a, b, parA);
            union(a, b, parB);
            sb.append(a).append(" ").append(b).append("\n");
            found++;
            i++;
        }
        System.out.println(found);
        System.out.print(sb);
        

        

    }
}
