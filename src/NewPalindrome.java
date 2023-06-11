import java.util.*;
public class NewPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            HashSet<Character> set = new HashSet<>();
            int n = s.length();
            int half = n / 2;
            for (int i = 0; i < half; i++) {
                set.add(s.charAt(i));
            }
            if (set.size() > 1)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}
