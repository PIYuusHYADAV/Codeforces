import java.util.*;
public class Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            long x = sc.nextLong();
            int flag = 0;
            for(long a = 1; a*a*a < x; a++)
            {
                long remaining = x - (a*a*a);
                long val = (long)Math.cbrt(remaining);
                if(val*val*val == remaining) 
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)  System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
