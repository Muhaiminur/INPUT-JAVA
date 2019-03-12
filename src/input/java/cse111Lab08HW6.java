package input.java;
/*HW6 (Encryption)
Given a line as keyboard input in small letters, print the next alphabet in sequence for each alphabet found in the input
Sample Input 1:
abcd
Sample output 1:
bcde

Sample Input 2:
the cowz
Sample output 2:
uif dpxa
*/
import java.util.Scanner;
public class cse111Lab08HW6{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Sample input 1");
    String x=abir.nextLine();
    int[]a=new int[x.length()];
    int c=0;
    while(c<a.length){
      a[c]=x.codePointAt(c);
      c++;
    }
    int d=0;
    while(d<a.length){
      System.out.print((char)(a[d]+1));
      d++;
    }
    System.out.println();
  }
}