package input.java;
/*HW 4
Write a program that asks the user for file name. Then prints the whole file on screen line by line. 
Hint: read each line and immediately print that line.
*/
import java.util.Scanner;
import java.io.*;
public class cse111Lab08HW4{
  public static void main(String[]args){
    try{
      Scanner abir1=new Scanner(System.in);
      System.out.println("enter a file name");
      String x=abir1.next();
    Scanner abir=new Scanner(new File("F:\\my cse code\\cse 111\\FINAL CSE111\\CSE111@LAB08\\"+x+".txt"));
    abir.useDelimiter(".*");
    while(abir.hasNextLine()){
      x = abir.nextLine();
      System.out.println(x);
    }
    }catch(Exception e){
      System.out.println(e);
    }
  }
}