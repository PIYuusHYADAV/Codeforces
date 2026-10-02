import java.util.*;
public class RoundNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            List<Long> arr = new ArrayList<>();
            int val = n;
            int power = 0;
            while(val > 0)
            {
                int rem = val % 10;
                if(rem != 0) arr.add((long)(rem * (Math.pow(10,power))));
                power++;
                val = val/10;
            }
            System.out.println(arr.size());
            for(long num : arr)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
