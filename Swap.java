import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            for(int m = 0; m < n; m++)
            {
                int val = sc.nextInt();
                a.add(val);
            }
            
            for(int m = 0; m < n; m++)
            {
                int val = sc.nextInt();
                b.add(val);
            }
            Collections.sort(a);
            Collections.sort(b);
            int left = 0;
            int right = b.size() - 1;
            int sum = 0;
            while(true)
            {
                if(right < 0) break;
                if(left >= a.size()) break;
                if(k == 0) break;
                if(a.get(left) >= b.get(right)) break;
                sum+=b.get(right);
                k--;
                left++;
                right--;
            }
            while(left < a.size())
            {
                sum+=a.get(left);
                left++;
            }
            System.out.println(sum);

        }
    }
}
