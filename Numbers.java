import java.util.*;
public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
      
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                int val = sc.nextInt();
                arr[i] = val;
            }
            long countBig = 0;
            int left = 0;
            int right = n-1;
            Arrays.sort(arr);
            while(left < right)
            {
                if((arr[left] + arr[right]) <= r)
                {
                    countBig+=right-left;
                    left++;
                }
                else
                {
                    right--;
                }

            }
            left = 0;
            right = n-1;
            long countSmall = 0;
            while(left < right)
            {
                if((arr[left]+arr[right])<l)
                {
                    countSmall+=right-left;
                    left++;
                }
                else
                {
                    right--;
                }
            }
            System.out.println(countBig-countSmall);
        }
        
    }
}
