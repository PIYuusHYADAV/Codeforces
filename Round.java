import java.util.*;
public class Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            
            int num = sc.nextInt();
            if(count < k)
            {
                max = Math.max(num,max);
                min = Math.min(min,num);
                count++;
            }
            else
            {
                if(num <= max && num >= min)
                {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
