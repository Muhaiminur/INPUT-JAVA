package input.java;
/*Task 3
Modify your solution of Task 2 and complete the following program.
Program Expected Output
class Lab10Task03{
    public static void main(String[] args){
        String a[]={"40", "50", "60"};
        // write your code here
    }
} 40
50
60

*/
import java.util.Scanner;
public class cse111Lab08task3{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    String a[]={"40", "50", "60"};
    int c=0;
    while(c<a.length){
      System.out.println(a[c]);
      c++;
    }
  }
}