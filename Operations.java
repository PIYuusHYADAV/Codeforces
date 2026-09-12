import java.util.*;
public class Operations {
    private static int maxVal = Integer.MIN_VALUE;
    private static int minOperation= Integer.MAX_VALUE;
    private static void Eval(int x, int y,int prevVal,int minOperations)
    {
        if(prevVal == )
        if(prevVal > maxVal)
        {
            maxVal = prevVal;
            minOperation = minOperations;
        }
        if(x==0) return;
        
        int val = x^y;
        
        Eval(x-1,y+1,val,minOperations+1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Eval(x, y, -1, 0);
            System.out.println(maxVal);
            System.out.println(minOperation);
            maxVal= Integer.MIN_VALUE;
            minOperation= Integer.MAX_VALUE;
        }
    }
}
