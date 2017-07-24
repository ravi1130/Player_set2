import java.io.*;
public class HolidayOrWorkingday{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
if(str.equalsIgnoreCase("sunday"))
System.out.println("False");
else
System.out.println("True");
}
}
