import java.util.*;
class specialNo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,m=0,p=0,temp=0,temp1=0;
n=s.nextInt();
int l=n;
if(n>10 && n<99){
m=n%10;
n=n/10;
temp=m+n;
temp1=m*n;
p=temp+temp1;
}
if(l==p){
System.out.println("special");
}else{
System.out.println("notspecial");
}
}
}
