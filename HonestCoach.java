import java.util.*;
public class HonestCoach {
  
    
    // private static int Eval(List<Integer> arr , int index, int maxValue, int minValue,int[][][] dp)
    // {
    //     if(index < 0)
    //     {
    //         if(maxValue == 0 || minValue == 1001) return Integer.MAX_VALUE;
    //         return Math.abs(maxValue-minValue);
           
    //     }
    //     if(dp[index][maxValue][minValue] != -1) return dp[index][maxValue][minValue];
    //     return dp[index][maxValue][minValue] = Math.min(Eval(arr,index-1,Math.max(maxValue,arr.get(index)),minValue,dp),Eval(arr,index-1,maxValue,Math.min(minValue,arr.get(index)),dp));
       
        
       
        
       
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++)
        {
            List<Integer> arr = new ArrayList<>();
           
           
            int n = sc.nextInt();
            for(int j = 0; j < n; j++)
            {
                int val = sc.nextInt();
                
                arr.add(val);
            }
            Collections.sort(arr);
            int k = 0;
            int j = 1;
            int minDiff = Integer.MAX_VALUE;
            while(j < arr.size())
            {
                minDiff = Math.min(minDiff,arr.get(j)-arr.get(k));
                j++;
                k++;
            }
            System.out.println(minDiff);
            
        


        }
    }
}
