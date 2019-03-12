package input.java;
/*Task 2
Complete the following program. You must use loop and arrayName.length for all current and future tasks in all labs. For example, 
following array name is �a�, so you should write a.length instead of 3 to stop the loop.

Program Expected Output
class Lab10Task02{
    public static void main(String[] args){
        int a[]={10, 20, 30};
        // write your code here
    }
} 10
20
30
*/
import java.util.Scanner;
public class cse111Lab08task2{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int a[]={10, 20, 30};
    int c=0;
    while(c<a.length){
      System.out.println(a[c]);
      c++;
    }
  }
}