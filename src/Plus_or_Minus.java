import java.util.*;
public class Plus_or_Minus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans=sc.nextInt();
            if(a+b==ans)
                System.out.println("+");
            else
                System.out.println("-");
        }
    }
}
