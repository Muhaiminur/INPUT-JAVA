package input.java;
/*HW7 (Decryption)
Given a line as keyboard input in small letters, do the opposite of HW5
Sample Input 1:
bcde
Sample output 1:
abcd

Sample Input 2:
uif dpx
Sample output 2:
the cow
*/
import java.util.Scanner;
public class cse111Lab08HW7{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    System.out.println("Sample input 1");
    String x=abir.next();
    int[]a=new int[x.length()];
    int c=0;
    while(c<a.length){
      a[c]=x.codePointAt(c);
      c++;
    }
    int d=0;
    while(d<a.length){
      System.out.print((char)(a[d]-1));
      d++;
    }
    System.out.println();
  }
}