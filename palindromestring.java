import java.util.*;
 public class string{
public static void main(String args[]){
Scanner s= new Scanner(System.in);
String s1,rev=" ";
s1=s.nextLine();
for(int i=s1.length()-1;i>=0;i--){
rev=rev+s1.charAt(i);
}
if(s1.equals(rev)){
System.out.println("Palindrome");
}else{
System.out.println("Not palindrome");
}
}
}