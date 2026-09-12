

import java.util.*;
public class FlooxMex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            boolean[] inB = new boolean[n];
            boolean[] forbidden = new boolean[n];

            for (int k = 1; k <= n; k++) {
                int target = arr[k - 1];

                int lo = target * k;
                int hi = Math.min(n - 1, target * k + k - 1);
                for (int i = lo; i <= hi && i < n; i++) {
                    forbidden[i] = true;
                }

                for (int j = 0; j < target; j++) {
                    int blo = j * k;
                    int bhi = Math.min(n - 1, j * k + k - 1);
                    if (blo > n - 1) continue;

                    boolean hit = false;
                    for (int i = blo; i <= bhi; i++) {
                        if (inB[i]) { hit = true; break; }
                    }

                    if (!hit) {
                        for (int i = blo; i <= bhi; i++) {
                            if (!forbidden[i]) {
                                inB[i] = true;
                                break;
                            }
                        }
                    }
                }
            }

            List<Integer> B = new ArrayList<>();
            for (int i = 0; i < n; i++) if (inB[i]) B.add(i);

            out.append(B.size()).append("\n");
            StringBuilder line = new StringBuilder();
            for (int x : B) line.append(x).append(" ");
            out.append(line.toString().trim()).append("\n");
        }
        System.out.print(out);
    }
}
