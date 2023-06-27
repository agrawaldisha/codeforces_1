import java.util.*;
public class Add_Plus_Minus_Sign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String ans = "";
            int n = sc.nextInt();
            char[] arr = sc.next().toCharArray();
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 0 || arr[i] == 1 && arr[i + 1] == 0 || arr[i + 1] == 1) ans = ans + "+";
                else ans=ans+ "-";
            }
            System.out.println(ans);
        }
    }
}
