import java.util.*;
public class ThreePiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if(a < b)
            {
                long currVal = Math.abs(a-b);
                if(currVal*2 <= c)
                {
                    a+=c;
                }
                System.out.println(Math.abs(a-b));
            }
            else
            {
                a+=c;
                System.out.println(Math.abs(a-b));
            }
        }
    }
}
