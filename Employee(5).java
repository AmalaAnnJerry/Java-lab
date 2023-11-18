import java.util.*;
class Employee
{
int empno,phno;
String name;

void details()
{
Scanner sc=new Scanner(System.in);
Employee E[]=new Employee[5];
for(int i=0;i<5;i++)
{
E[i]=new Employee();
System.out.println("Enter the details "+(i+1)+":");
System.out.println("Name:");
E[i].name=sc.next();
System.out.println("Employee no.:");
E[i].empno=sc.nextInt();
System.out.println("Phone no.:");
E[i].phno=sc.nextInt();
}
for(int i=0;i<5;i++)
{
System.out.println("Details of "+(i+1)+"\n"+"Name:"+E[i].name +"\n"+"Empno:"+E[i].empno+"\n"+"Phone no:"+E[i].phno);
}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Employee e=new Employee();
e.details();
}
}










