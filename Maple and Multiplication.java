Maple has two positive integers a
 and b
. She may perform the following operation any number of times (possibly zero) to make a
 equal to b
:

Choose any positive integer x
, and multiply either a
 or b
 by x
.
Your task is to determine the minimum number of operations required to make a
 equal to b
. It can be proven that this is always possible.


Example
input
3
1 2
10 3
1000 1000
output
1
2
0

CODE:
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                System.out.println(0);
            } else if (a % b == 0 || b % a == 0) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
