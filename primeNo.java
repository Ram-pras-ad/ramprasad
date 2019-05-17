import java.util.*;
class primeNo{
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
int n1,n2,i,j,count=0,temp=0;
n1=s.nextInt();
n2=s.nextInt();
for(i=n1;i<=n2;i++){
for(j=2;j<=i/2;j++){
if(i%j==0){
count=0;
break;
}
else{
count=1;
}
}
if(count==1){
 System.out.print(i);
temp=i;
}
}
System.out.print(temp);
}
}
