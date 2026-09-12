import java.util.*;
public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hm = new HashMap<>();
        List<String> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++)
        {
            String str = sc.next();
            arr.add(str);
        }
        for(String s : arr)
        {
            if(!hm.containsKey(s))
            {
                hm.putIfAbsent(s,0);
                System.out.println("OK");
            }
            else
            {
                int val = hm.get(s);
                String result = s + ++val;
                hm.put(s,hm.getOrDefault(s, 0)+1);
                System.out.println(result);
                
            }
        }
    }
}
