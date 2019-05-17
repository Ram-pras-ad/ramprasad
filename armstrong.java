import java.util.*;
class armstrong{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,m=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,l=0;
n=s.nextInt();
if(n>=1000 && n<=9999){
m=n%10;
a=m*m*m*m;
b=n/10;
c=b%10;
d=c*c*c*c;
e=b/10;
f=e%10;
g=f*f*f*f;
h=e/10;
i=h%10;
j=i*i*i*i;
l=a+d+g+j;
}
if(n==l){
System.out.println("Armstrong");
}else{
System.out.println("Not armstrong");
}
}
}

