import java.util.*;
public class Kuriyama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            int val = sc.nextInt();
            arr.add(val);

        }
        long[] prefix = new long[arr.size()+1];
        for(int i = 0; i < arr.size(); i++)
        {
            prefix[i+1] = prefix[i] + arr.get(i);
        }
        long[] sortPrefix = new long[arr.size()+1];
        Collections.sort(arr);
        for(int i = 0; i<arr.size(); i++)
        {
            sortPrefix[i+1] = sortPrefix[i] + arr.get(i);
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++)
        {
            int key = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
          
            if(key == 1) System.out.println(prefix[r] - prefix[l-1]);
            else System.out.println(sortPrefix[r] - sortPrefix[l-1]);
        }
    }
}
