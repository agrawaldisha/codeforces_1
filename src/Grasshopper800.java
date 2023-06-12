import java.util.*;

public class Grasshopper800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int a[] = new int[2];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
        int temp=a[0];
        if((a[0]/a[1])<1){
            System.out.println(1);
            System.out.println(a[0]);
        }
        else{
            while(a[0]%a[1]!=0){
                a[0]=a[0]-1;
            }
            a[1]=temp-a[0];
            System.out.println(2);
            System.out.println(a[0]+" "+a[1]);
        }
        }
    }
}
