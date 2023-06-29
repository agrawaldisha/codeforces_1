//package codeforecs_900;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class Comparison_String {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0)
//        {
//            int n=sc.nextInt();
//            int[] arr=new int[n];
//            String str=sc.next();
//            HashSet<Integer>  set=new HashSet<>();
//            arr[0]=0;
//            for(int i=1;i<n;i++) {
//                if (str.charAt(i) == '>') {
//                    arr[i] = arr[i - 1] + 1;
//                    System.out.print(str.charAt(i));
//                    System.out.println(" "+i);
//                    System.out.println("Enteered in 1");
//                }
//                else {
//                    arr[i] = arr[i - 1] - 1;
//                    System.out.println("entered");
//                }
//                System.out.println(arr[i]);
//                set.add(arr[i]);
//            }
//            System.out.println(set.size());
//        }
//    }
//}
