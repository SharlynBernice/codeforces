It is known that a contest can be represented by a string s
, consisting of uppercase Latin letters that denote problems. It is also known that a contest is difficult if it contains "FFT" or "NTT" as a contiguous substring.

Your task is to rearrange the problem in contest s
 in such a way that this contest is not difficult. If the initial contest is not difficult, you may leave it as it is.


Example
Input
5
FFT
ABFBANTTA
FFTNTT
FFTFFTFFTNNTNNT
AFFTBFFNTTFTTZ
  
Output
FTF
ABFBANATT
NTFTFT
TFFFFFFNTNTNTNT
AFTFBTTFFNFTTZ


CODE:

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner z=new Scanner(System.in);
        int t=z.nextInt();
        z.nextLine();
        while(t-->0){
            String str=z.nextLine();
            if(!(str.contains("FFT")||str.contains("NTT"))){
                System.out.println(str);
                continue;
            }
            StringBuilder sb=new StringBuilder();
            int fCount=0,nCount=0,tCount=0;
            for(char ch:str.toCharArray()){
                if(ch=='F'){
                    fCount++;
                }   
                else if(ch=='N'){
                    nCount++;
                }
                else if(ch=='T'){
                    tCount++;
                }
                else{
                    sb.append(ch);
                }
            }
            for(int i=0;i<tCount;i++){
                System.out.print('T');
            }
            System.out.print(sb.toString());
            for(int i=0;i<nCount;i++){
                System.out.print('N');
            }
            for(int i=0;i<fCount;i++){
                System.out.print('F');
            }
            System.out.println();
        }
    }
}
