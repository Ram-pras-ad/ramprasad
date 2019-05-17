import java.util.*;
class fibonacci{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i,n,n3,n1=0,n2=1;
n=s.nextInt();
for(i=0;i<=n;i++){
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}
}
}