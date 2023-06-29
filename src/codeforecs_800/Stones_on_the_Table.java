package codeforecs_800;

import java.util.*;
public class Stones_on_the_Table {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        char[] arr=sc.next().toCharArray();
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])count+=1;
        }
        System.out.println(count);
    }
}
