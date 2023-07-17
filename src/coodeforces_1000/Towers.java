package coodeforces_1000;
import java.util.*;
public class Towers {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    HashMap<Integer,Integer> map=new HashMap<>();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        if(!map.containsKey(arr[i]))map.put(arr[i],1);
        else map.put(arr[i], map.getOrDefault(arr[i],1)+1);
    }
    int max=Integer.MIN_VALUE;
    for(int i:map.keySet()){
        if(map.get(i)>max)max=map.get(i);
    }
        System.out.print(max+" ");
        System.out.println(map.size());
}
}
