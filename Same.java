import java.util.*;
public class Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for(int j = 0; j < n; j++)
            {
                int val = sc.nextInt();
                arr.add(val);
            }
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int k = 0; k < n; k++)
            {
                hm.put((arr.get(k) - k) , hm.getOrDefault((arr.get(k)-k), 0)+1);
            }
            long pairs = 0;
            for(int freq : hm.values())
            {
                if(freq > 1) pairs+=(long)freq * (freq - 1) / 2;
            }
            System.out.println(pairs);
        }
    }
}
