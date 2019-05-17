import java.util.*;
class grade{
public static void main(String args[]){
Scanner s=new Scanner (System.in);
int n;
n=s.nextInt();
if(n>=0 && n<=100){
if(n>=0 && n<=40){
System.out.println("U");
}
if(n>=41 && n<=50){
System.out.println("D");
}
if(n>=51 && n<=60){
System.out.println("C");
}
if(n>=61 && n<=70){
System.out.println("B+");
}
if(n>=71 && n<=80){
System.out.println("B");
}
if(n>=81 && n<=90){
System.out.println("A");
}
if(n>=91 && n<=100){
System.out.println("S");
}
}
}
}