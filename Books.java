import java.util.*;
public class Books {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfBooks = sc.nextInt();
        int time = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= numberOfBooks; i++)
        {
            int val = sc.nextInt();
            arr.add(val);
        }
       
        int[] prefixSum = new int[arr.size()+1];
        for(int i = 0; i < arr.size();i++)
        {
            prefixSum[i+1] = prefixSum[i] + arr.get(i);
        }
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        while(j < arr.size())
        {
            while((prefixSum[j+1] - prefixSum[i]) > time)
            {
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        System.out.println(max);
       
        

    }
}
