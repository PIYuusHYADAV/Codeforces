import java.util.*;
public class Contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < 3; j++)
            {
                int val = sc.nextInt();
                min = Math.min(min,val);
            }
            System.out.println(n - min);
        }
    }
}
