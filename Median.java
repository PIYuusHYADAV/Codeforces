import java.util.*;
public class Median {
    private static long check(int m,int[] arr,int mid)
    {
        long total = 0;
        for(int i = mid; i < arr.length; i++)
        {
            total+=Math.max(0,(m-arr[i]));
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            int val = sc.nextInt();
            arr[i] = val;
        }
        Arrays.sort(arr);
        int mid = n/2;
        int low = arr[mid];
        int high = arr[mid]+k;
        while(low < high)
        {
            int m = low + (high-low+1)/2;
            if(check(m,arr,mid) <= k)
            {
                low = m;
            }
            else
            {
                high = m-1;
            }

        }
        System.out.println(low);
    }
}
