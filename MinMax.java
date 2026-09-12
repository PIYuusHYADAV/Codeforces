import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            int len = sc.nextInt();
            Deque<Integer> dq = new ArrayDeque<>();
            for(int j = 0; j < len; j++)
            {
                int val = sc.nextInt();
                if(val == 0) dq.addFirst(0);
                else dq.addLast(1);
            }
            String turn = "Bessie";
            while(dq.size() != 1)
            {
                int val1 = dq.removeFirst();
                int val2 = dq.removeLast();
                if(turn.equals("Bessie"))
                {
                    dq.addLast(Math.max(val1,val2));
                    turn = "Elsie";
                }
                else
                {
                    dq.addFirst(Math.min(val1,val2));
                    turn = "Bessie";
                }

            }
            if(dq.peek() == 1) System.out.println("Bessie");
            else System.out.println("Elsie");

        }
    }
}
