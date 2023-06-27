//package codeforecs_800;
import java.util.*;
public class alttab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] str=new String[t];
        for(int i=0;i<t;i++){
            String s=sc.next();
            str[i]=s;
        }
        HashSet<String> set=new HashSet<>();
        String ans="";
        for(int j=t-1;j>-1;j--)
        {
            if(!set.contains(str[j])){
                set.add(str[j]);
                ans=ans+str[j].substring(str[j].length()-2);
            }
        }
        System.out.println(ans);
    }
}