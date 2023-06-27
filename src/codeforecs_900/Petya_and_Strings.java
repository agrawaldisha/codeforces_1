package codeforecs_900;
import java.util.*;
public class Petya_and_Strings {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String str1=sc.next().toLowerCase();
    String str2=sc.next().toLowerCase();
    int ans=0;
    for(int i=0;i<str1.length();i++)
    {
        if(str1.charAt(i)>str2.charAt(i)){
            ans=1;
            break;
        }
        if(str2.charAt(i)>str1.charAt(i)){
            ans=-1;
            break;
        }
    }
        System.out.println(ans);
}
}