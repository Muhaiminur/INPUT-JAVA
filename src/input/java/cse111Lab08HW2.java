package input.java;
/*HW 2
Modify your Task 6 or HW1 so that your program takes input from b.txt file. That file will contain three numbers 
(16  17  18) but on the same line. Output should be 51. Hint: use the  method next() and hasNext() instead of nextLine() and hasNextLine();
*/
import java.util.Scanner;
import java.io.*;
public class cse111Lab08HW2{
  public static void main(String[]args){
    try{
    Scanner abir=new Scanner(new File("F:\\my cse code\\cse 111\\FINAL CSE111\\CSE111@LAB08\\abir1.txt" ));
    abir.useDelimiter(", *");
    int x=0;
    int sum=0;
    while(abir.hasNext()){
      x = Integer.parseInt(abir.next());
      System.out.println(x);
      sum=sum+x;
    }
    System.out.println(sum);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}