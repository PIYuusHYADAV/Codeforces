import java.util.*;

public class Monoscrap {
    private static int Validate(List<Integer> arr)
    {
        int prevsmall = -1;
        int newsmall = -1;
        int counter = 1;
        if(arr.get(0) == 0 && arr.get(arr.size()-1) == 0) return 0;
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i) == 0)
            {
                if(counter == 1)
                {
                    prevsmall = i;
                    counter++;
                }
                else
                {
                    newsmall = i;
                    break;
                }
            }
        }
        if(prevsmall == -1 || newsmall == -1) return -1;
        if(arr.get(0) == 0 && arr.get(arr.size() -1) != 0) return 1;
        else if(arr.get(0) != 0 && arr.get(arr.size()-1)==0) return 1;
        else return 2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            List<Integer> arr = new ArrayList<>();
            int len = sc.nextInt();
            for(int j = 0; j<len;j++)
            {
                int z = sc.nextInt();
                arr.add(z);
            }
            System.out.println(Validate(arr));

        }
    }
}
