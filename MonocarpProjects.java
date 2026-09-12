import java.util.*;
public class MonocarpProjects {
    private static long Evaluate(long x,long y, long k)
    {
        long totalprojects = 0;
        long d = y-x;
        long counter = 0;
        while(counter < k && x+counter <= d)
        {
            totalprojects+=(d%(x+counter));
            
            counter++;
        }
        totalprojects+=(k-counter)*d;
        return totalprojects;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0; i < testcases; i++)
        {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(Evaluate(x,y,k));
        }
    }
}
