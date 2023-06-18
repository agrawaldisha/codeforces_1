import java.util.*;
public class Increasing {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int t=sc.nextInt();
            int[] arr=new int[t];
            for(int i=0;i<t;i++)
            {
                arr[i]= sc.nextInt();
            }
            String ans="YES";
            Arrays.sort(arr);
            for(int i=0;i<t-1;i++)
            {
                if(arr[i]==arr[i+1])
                    ans="NO";
            }
            System.out.println(ans);
        }
    }
}
