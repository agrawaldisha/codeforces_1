import java.util.*;
public class Boxes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            ArrayList<Integer> mid = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int v = (int)( (Math.log(arr[i])/Math.log(2)) + 1);
                map.put(v, map.getOrDefault(v, 0) + 1);
                mid.add(v);
            }
            Collections.sort(mid);
            int x = map.get(mid.get(mid.size() - 1));
            System.out.println((x + 1) / 2);
    }
}

