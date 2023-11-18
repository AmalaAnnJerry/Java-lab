import java.util.*;                                                                                  
class Detail
{
Scanner sc=new Scanner(System.in);
String name;
int rollno;
int mark[]=new int[5];

void read()
{
System.out.println("enter the name");
name=sc.nextLine();
System.out.println("enter the roll no");
rollno=sc.nextInt();
for(int i=0;i<5;i++)
{
System.out.println("enter marks of subject"+(i+1)+":");
mark[i]=sc.nextInt();
}
}

void display()
{
System.out.println("name :"+name);
System.out.println("roll no:"+rollno);
for(int i=0;i<5;i++)
{
System.out.println("Mark of sub"+(i+1)+":"+mark[i]);
}
}
}

class Student
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Detail D=new Detail();
D.read();
D.display();
}
}






















