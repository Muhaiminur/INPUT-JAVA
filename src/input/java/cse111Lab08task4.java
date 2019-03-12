package input.java;
/*Task 4
Using Dr. Java, modify your solution of Task 3,
� Delete the line: String a[]={"40", "50", "60"};
� Rename all a.length to args.length
� Rename all a[i] to args[i]
Compile 
Run your program using both
� Dr. Java (After compiling, write java   YourClassNameHere   70   80   90    at the interaction pane)
� cmd Console (After compiling, write java   YourClassNameHere   100   110   120    at the cmd console)
� Dr. Java (After compiling, write java   YourClassNameHere   Eid Mubarak    at the interaction pane)
� cmd Console (After compiling, write java   YourClassNameHere   I did not work on Applets    at the cmd console)
*/
import java.util.Scanner;
public class cse111Lab08task4{
  public static void main(String[]args){
    Scanner abir=new Scanner(System.in);
    //String a[]={"40", "50", "60"};
    int c=0;
    while(c<args.length){
      System.out.println(args[c]);
      c++;
    }
  }
}