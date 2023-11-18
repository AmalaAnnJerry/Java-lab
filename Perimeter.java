import java.util.*;
class Perimeter
{
double p;
Perimeter(double r)
{
p=2*3.14*r;
}
Perimeter(int l,int b)
{
p =2*(l+b);
}
Perimeter(int s)
{
p =4*s;
}

double peri()
{
return p;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of circle");
double r=sc.nextDouble();
Perimeter P=new Perimeter(r);
System.out.println("perimter of circle:"+P.peri());
System.out.println("Enter the length and breadth of rectangle");
int l=sc.nextInt();
int b=sc.nextInt();
Perimeter P1=new Perimeter(l,b);
System.out.println("perimter of rectangle:"+P1.peri());
System.out.println("Enter the side of square");
int s=sc.nextInt();
Perimeter P2=new Perimeter(s);
System.out.println("perimter of square:"+P2.peri());
}
}



