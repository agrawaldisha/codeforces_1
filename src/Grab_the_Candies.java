import java.util.*;
public class Grab_the_Candies {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int oc = 0,ec=0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0)ec+=arr[i];
                else
                    oc+=arr[i];
            }
            if(ec>oc) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
