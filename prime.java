import java.util.*;
class prime
{
public static void main(String args[])
{
int n,i,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
for(i=2;i<=n/2;i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("is prime");
}
else
{
System.out.println("number is not prime");
}
}

}


