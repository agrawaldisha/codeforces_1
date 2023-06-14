import java.util.*;
public interface Karina_and_Array800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            System.out.println(Math.max((arr[0] * arr[1]), (arr[n - 1] * arr[n - 2])));
        }
        //find gteatest form arrray
    }
}
