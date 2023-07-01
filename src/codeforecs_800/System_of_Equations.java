package codeforecs_800;
import java.util.*;
public class System_of_Equations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        for(int i=0;i<a;i++) {
            for (int j = i + 1; j < b; j++) {
                if (i * i + j == a || i + j * j == b)count++;
            }
        }
        System.out.println(count);
    }
}
