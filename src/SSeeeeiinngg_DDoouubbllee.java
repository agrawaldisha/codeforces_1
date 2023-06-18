//import java.util.*;
//public class SSeeeeiinngg_DDoouubbllee {
//        public static String makePalindrome(String str)
//        {
//            String ans="";
//            Map<Character, Integer> charFrequency = new HashMap<>();
//            for (char c : str.toCharArray()) {
//                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
//            }
//            while(())
//            for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()){
//                char c = entry.getKey();
//                int count = entry.getValue();
//                if(count%2==0) {
//                        ans=ans+(c);
//                        count=count%2;
//                }
//
//
//            }
//            return ans;
//        }
//        public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0)
//        {
//            String str=sc.next();
//            String str1=str+str;
//            System.out.println("str1"+str1);
//            String ans=makePalindrome(str1);
//            System.out.println(ans);
//        }
//    }
//}
import java.util.*;
public class SSeeeeiinngg_DDoouubbllee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            String s1 = s;
            for (int i = s.length() - 1; i >= 0; i--) {
                s1 = s1 + s.charAt(i);
            }
            System.out.println(s1);
        }
    }
}