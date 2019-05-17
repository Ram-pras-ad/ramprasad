import java.util.*;
class factorial{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,i,fact=1;
n=s.nextInt();
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.println(fact);
}
}