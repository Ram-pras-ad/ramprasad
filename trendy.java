import java.util.*;
class trendy{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,m=0,p=0,a=0;
n=s.nextInt();
if(n>=100 && n<=999){
m=n%10;
a=n/10;
p=a%10;
}
if(p%3==0){
System.out.println("trendy");
}else{
System.out.println("Not trendy");
}
}
}