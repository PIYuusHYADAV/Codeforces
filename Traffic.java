import java.util.*;
public class Traffic {
    private static int findMinTime(String str,char ch)
    {
        int i = 0;
        int j = 0;
        int ans = Integer.MIN_VALUE;
        if(ch == 'g') return 0;
        int counter  = 0;
        while(i < str.length())
        {
            while(i<str.length() && str.charAt(i) != ch)
            {
                i++;
            }
            if(i == str.length())
                break;

            j = i;
            counter = 0;

           
            while(str.charAt(j) != 'g')
            {
                j = (j + 1) % str.length();
                counter++;
            }

            ans = Math.max(ans, counter);

            i++;

            


        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            
            int len = sc.nextInt();
            char ch = sc.next().charAt(0);
            
            String s = sc.next();
            System.out.println(findMinTime(s,ch));
        }
    }
}
