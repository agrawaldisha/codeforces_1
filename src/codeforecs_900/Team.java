package codeforecs_900;
import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n-->0) {
            int ans=0;
            int a = sc.nextInt();
            if (a == 1) ans++;
            int b = sc.nextInt();
            if (b == 1) ans++;
            int c = sc.nextInt();
            if (c == 1) ans++;
            if(ans>=2)count++;
        }
            System.out.println(count);
    }
}
