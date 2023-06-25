import java.util.*;
public class Square_Counting {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        //System.out.println(t);
        while(t-->0)
        {
            long a= sc.nextLong();
            long b=sc.nextLong();
            System.out.println(b/(a*a));
        }
    }
}
