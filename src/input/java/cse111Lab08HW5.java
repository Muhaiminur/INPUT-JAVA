package input.java;
/*HW5
Given a file name, delete that file. Hint: read 
http://192.168.0.84/bucc/javadoc/api/java/io/File.html#delete()
http://www.java2s.com/Code/Java/File-Input-Output/DeletefileusingJavaIOAPI.htm
*/
import java.util.Scanner;
import java.io.*;
public class cse111Lab08HW5{
  public static void main(String[]args){
    try{
      File x=new File("F:\\my cse code\\cse 111\\FINAL CSE111\\CSE111@LAB08\\abir5.txt");
      boolean b=x.createNewFile();
    }catch(IOException e){
      System.out.println(e);
      e.printStackTrace();//this prin including the vhul line number where println kre na
    }
    try{
      File x=new File("F:\\my cse code\\cse 111\\FINAL CSE111\\CSE111@LAB08\\abir5.txt");
      boolean b=x.delete();
      System.out.println(x.getName());
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}