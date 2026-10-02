import java.util.*;
public class ANDSORT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int len = sc.nextInt();
            String str = sc.next();
            if(str.charAt(0) == '1')
            {
                int zeros = 0;
                for(int j = 0; j < len; j++)
                    if(str.charAt(j) == '0') zeros++;
                System.out.println(zeros);
            }
            else
            {
                int totalZeros = 0;
                for(int j = 0; j < len; j++)
                    if(str.charAt(j) == '0') totalZeros++;

                int ones = 0, zerosSeen = 0;
                int best = len;

                for(int k = 1; k <= len; k++)
                {
                    if(str.charAt(k-1) == '1') ones++;
                    else zerosSeen++;

                    int cost = ones + (totalZeros - zerosSeen);
                    best = Math.min(best, cost);
                }
                System.out.println(best);

            }
        }
        
        
    }
}
