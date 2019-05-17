import java.util.*;
class foobar{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
n=s.nextInt();
if(n%3==0 && n%5==0){
System.out.println("foobar");
}else if(n%3==0){
System.out.println("foo");
}else if(n%5==0){
System.out.println("bar");
}else{
System.out.println("None");
}
}
}