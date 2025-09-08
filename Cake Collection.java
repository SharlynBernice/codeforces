Maple wants to bake some cakes for Chocola and Vanilla.

One day, she discovers n
 magical cake ovens. The i
-th oven bakes ai
 cakes every second. The cakes remain in their respective ovens until they are collected.

At the end of each second, she may teleport to any oven (including the one she is currently at) and collect all the cakes that have accumulated in that oven up to that point.

Your task is to determine the maximum number of cakes Maple can collect in m
 seconds.

Example
Input
3
3 4
1 2 3
3 2
1 2 3
1 1000
100000
Output
20
8
100000000

CODE:
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            int k = (int) Math.min(n, m);
            long ans = 0;
            for (int i = 0; i < k; i++) {
                ans += a[n - 1 - i] * (m - i);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
