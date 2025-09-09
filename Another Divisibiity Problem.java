Alice and Bob are playing a game in which Alice has given Bob a positive integer x<108
.

To win the game, Bob has to find another positive integer y<109
 such that x#y
 is divisible by x+y
.

Here x#y
 denotes the integer formed by concatenating the integers x
 and y
 in that order. For example, if x=835
, y=47
, then x#y=83547
.

However, since Bob is dumb, he is unable to find such an integer. Please help him.

It can be shown that such an integer always exists.

Example
Input
6
8
42
1000
66666
106344
9876543
Output
1
12
998
7872
8190
174036
  
Note
For the first test case, x=8
, we can choose y=1
, and we have x#y=81
, which is divisible by x+y=9
.

For the second test case, x=42
, we can choose y=12
, and we have x#y=4212
, which is divisible by x+y=54
.


CODE:

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        int t=z.nextInt();
        while(t-->0){
            int num=z.nextInt();
            System.out.println(num*2);
        }
    }
}
