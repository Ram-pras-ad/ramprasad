import java.util.*;
class perfect{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,m=0;
n=s.nextInt();
if(n>=1 && n<=1000){
m=(int)Math.sqrt(n);
}
if(m*m==n){
System.out.println("perfect");
}else{
System.out.println("Not perfect");
}
}
}
