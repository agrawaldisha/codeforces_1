
import java.util.*;

import static java.lang.Integer.*;

public class Plus_One_on_the_Subset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max=Math.max(max,arr[i]);
                min=Math.min(min,arr[i]);
            }
            System.out.println(max-min);
        }
    }
}