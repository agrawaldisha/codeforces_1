import java.util.*;
public class LuoTianyi_and_the_Palindrome_String800 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            String str=sc.next();
            int flag=0;
            for(int i=0;i<str.length()-1;i++)
            {
                if(str.charAt(i)!=str.charAt(i+1)){
                    flag=1;
                    break;
                }
            }
             System.out.println((flag==0)?-1:str.length()-1);
        }

    }
}
