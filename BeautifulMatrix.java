import java.util.*;
public class BeautifulMatrix {
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        public Pair(int x,int y)
        {
            this.x = x;
            this.y = y;
        }
        @Override 
        public int compareTo(Pair other)
        {
            return Integer.compare((int)(Math.abs(this.x - 2) + Math.abs(this.y - 2)),(int)(Math.abs(other.x - 2) + Math.abs(other.y - 2)));
        }
    }
    private static int[] dirx = {0,-1,0,+1};
    private static int[] diry = {-1,0,+1,0};
    private static int minimumOperations(int[][] matrix,int x, int y)
    {
        int count = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(x, y));
        while(!pq.isEmpty())
        {
            Pair curr = pq.remove();
            
            
            if(curr.x == 2 && curr.y == 2) break;
            count++;
            for(int i = 0; i < dirx.length; i++)
            {
                int newx= curr.x + dirx[i];
                int newy= curr.y + diry[i];
                if(newx >= 0 && newx < 5 && newy >=0 && newy < 5)
                {
                    pq.add(new Pair(newx, newy));
                }
            }

        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int x = -1;
        int y = -1;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
            {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1)
                {
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(minimumOperations(matrix, x, y));
    }
}
