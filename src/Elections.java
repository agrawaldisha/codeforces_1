import java.util.*;
public class Elections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
                }
            System.out.print(Math.max(0,Math.max(arr[1],arr[2])+1-arr[0])+" ");
            System.out.print(Math.max(0,Math.max(arr[0],arr[2])+1-arr[1])+" ");
            System.out.print(Math.max(0,Math.max(arr[0],arr[1])+1-arr[2]));
            System.out.println();
        }
    }
}
