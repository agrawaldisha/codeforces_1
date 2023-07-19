import java.util.*;
public class Solvers {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		int a=1,b=1,c=2;
		System.out.print("O");
		for(int i=2;i<=n;i++){
			if(i==c){
				System.out.print("O");
				a = b;
				b = c;
				c = a+b;
			}
			else System.out.print("o");
		}
	}
}
