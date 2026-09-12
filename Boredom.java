import java.util.*;
public class Boredom {
    private static long[] memo;
    private static long Eval(HashMap<Integer,Integer> hm , List<Integer> arr, int index, int n,long[] memo)
    {
        if(index < 0) return 0;
        if(memo[index] != -1) return memo[index];
        int val = arr.get(index);
        int currOcur = hm.get(val);
        int prevVal = -1;
        int nextVal = -1;
        int prevOc = -1;
        int nextOc = -1;
        if(hm.containsKey(val-1)) {                    
            prevVal = val-1;
            prevOc = hm.get(prevVal);
        }
        if(hm.containsKey(val+1)) {                    
            nextVal = val+1;
            nextOc = hm.get(nextVal);
        }
        
        if(hm.containsKey(val))
        {
            hm.remove(val);
            if(prevVal != -1) hm.remove(prevVal);
            if(nextVal != -1) hm.remove(nextVal);

            int nextIndex = (prevVal != -1) ? index - 2 : index - 1;   
            long pick = (long)val*currOcur + Eval(hm,arr,nextIndex,n,memo);

            hm.put(val,currOcur);
            if(prevVal != -1) hm.put(prevVal,prevOc);
            if(nextVal != -1) hm.put(nextVal,nextOc);
            long nonPick = Eval(hm,arr, index-1, n,memo);
            return memo[index] = Math.max(pick,nonPick);
        }
        else
        {
            hm.put(val,currOcur);
            if(prevVal != -1) hm.put(prevVal,prevOc);
            if(nextVal != -1) hm.put(nextVal,nextOc);
            return memo[index] = Eval(hm,arr, index-1, n,memo);
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        HashMap<Integer,Integer> hm = new HashMap<>();
        TreeSet<Integer> distinct = new TreeSet<>();
        for(int i = 0; i < n; i++)
        {
            int val = sc.nextInt();
            hm.put(val,hm.getOrDefault(val, 0)+1);
            distinct.add(val);
        }
        
        List<Integer> arr = new ArrayList<>(distinct);
        memo = new long[arr.size()];
        Arrays.fill(memo,-1);
        System.out.println(Eval(hm,arr,arr.size()-1,n,memo));

    }
}
