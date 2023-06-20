    import java.util.*;
    public class Div7 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                if(n%7==0)
                {
                    System.out.println(n);
                }
                else {
                    n=n/10;
                    n=n*10;
                    while(n%7!=0){
                        n++;
                    }
                    System.out.println(n);
                }
            }
        }
    }
