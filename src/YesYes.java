    import java.util.*;
    public class YesYes {
        public static void main(String[] args) {
            {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                String med="";
                for(int i=0;i<24;i++)med=med+"Yes";
                med+="Ye";
                while(t-->0)
                {
                    String str=sc.next();
                    if(med.contains(str)) System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }
