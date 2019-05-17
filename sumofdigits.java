import java.util.*;
class sumofdigits{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,m=0,temp=0;
n=s.nextInt();
while(n>0){
m=n%10;
n=n/10;
temp=temp+m;
}
System.out.println(temp);
}
}