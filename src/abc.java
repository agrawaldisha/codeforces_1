import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if((str.charAt(0)=='Y' || str.charAt(0)=='y') && (str.charAt(1)=='E' || str.charAt(1)=='e') && (str.charAt(2)=='S' || str.charAt(2)=='s'))
            System.out.println("First Program");
        System.out.println();
    }
}
