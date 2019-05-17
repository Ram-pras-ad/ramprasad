import java.util.*;
class Prime{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int low,high;
low=s.nextInt();
high=s.nextInt();
while(low<high){
boolean flag=false;
for(int i=2;i<=low/2;++i) {    
if(low%i==0) {
flag=true;
break;
}
}
if(!flag)
System.out.print(low+ " ");
++low;
}
}
}