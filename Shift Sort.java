You are given a binary string∗
 s
 of length n
 and you are allowed to perform the following operation any number of times (including zero):

Choose 3
 indices 1≤i<j<k≤n
 and right shift or left shift the values on si
, sj
, sk
 cyclically.
For the binary string 110110, if we choose i=1
, j=2
, k=3
 and perform a right shift cyclically, the string becomes 011110; if we choose i=4
, j=5
, k=6
 and perform a left shift cyclically, the string becomes 110101.

Determine the minimum number of operations required to sort the given binary string.

∗
A binary string is a string that consists only of the characters 0 and 1.


Example
Input
4
3
001
4
0110
6
110100
6
101011
Output
0
1
2
1


CODE:

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        int t=z.nextInt();
        while(t-->0){
            int n=z.nextInt();
            z.nextLine();
            String str=z.nextLine();
            int zeroCnt=0;
            for(char ch:str.toCharArray()){
                if(ch=='0'){
                    zeroCnt++;
                }
            }
            int count=0;
            for(int i=0;i<zeroCnt;i++){
                if(str.charAt(i)=='1'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
