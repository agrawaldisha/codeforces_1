import java.util.*;
public class Sasha_and_Array_Coloring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        boolean flag=false;
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            if(n==1)flag=true;
            Arrays.sort(arr);
            int sum=arr[0]-arr[n-1];
            sum+=arr[1]-arr[n-2];
            System.out.println(flag==true?0:sum);
        }
    }
}
