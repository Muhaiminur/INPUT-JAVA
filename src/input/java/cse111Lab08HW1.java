package input.java;
/*HW 1
Modify your Task 6 so that if a.txt file contains any number of lines each with one number, 
your program should sum all numbers and give correct output. Hint: hasNextLine()
method tells if the file has any line left. For more, read http://192.168.0.84/bucc/javadoc/api/java/util/Scanner.html
Example:
String line;
while(s.hasNextLine()){
     line = s.nextLine();
     System.out.println( line ); 
}
*/
import java.util.Scanner;
import java.io.*;
public class cse111Lab08HW1{
  public static void main(String[]args){
    try{
    Scanner abir=new Scanner(new File("F:\\my cse code\\cse 111\\FINAL CSE-111\\CSE111@LAB08\\abir.txt" ));
    abir.useDelimiter(", *");
    String line="";
    int sum=0;
    while(abir.hasNext()){
      line = abir.next();
      System.out.println(Integer.parseInt(line));
      sum=sum+Integer.parseInt(line);
    }
    System.out.println(sum);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}