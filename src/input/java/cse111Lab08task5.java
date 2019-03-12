package input.java;
/*Task 5
Modify your solution of Task 4 so that the following happens
If the program is run using Then it gives these outputs
java   YourClassNameHere   130   140   150     Content of args[0] is 130
Content of args[1] is 140
Content of args[2] is 150
java   YourClassNameHere   learn applet Content of args[0] is learn
Content of args[1] is  applet


Run Task 5 using following command and investigate what happened.
java   YourClassNameHere    Learn to "guard" yourselves. "Your suffering" was indeed "a great trial" for you.

*/
import java.util.Scanner;
public class cse111Lab08task5{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    int c=0;
    while(c<args.length){
      System.out.println("Content of args["+c+"] is "+args[c]);
      c++;
    }
  }
}