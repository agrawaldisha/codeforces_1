import java.util.*;
public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String st=sc.next();
        char[] str1=str.toCharArray();
        char[] str2=st.toCharArray();
        if(str1.length!=str2.length)
            System.out.println("NO");
        else{
            String ans="YES";
            int a=0;
            for(int i=str1.length-1;i>0;i--)
            {
                if(str1[0]!=str2[i]) {
                    ans = "NO";
                    break;
                }
                a++;
            }
            System.out.println("YS");
        }
    }
}
