import java.util.*;
class Shape
{
void Area(int a)
{
System.out.println(3.14*a*a);
}
void Area(int l,int b)
{
System.out.println(l*b);
}
void Area(float m,float h)
{
System.out.println((int)(0.5*m*h));
}
public static void main(String args[])
{
float m,h;
int l,b,a;
Scanner sc=new Scanner(System.in);
Shape S=new Shape();
System.out.println("Enter the radius");
a=sc.nextInt();
System.out.println("Area of circle"+" ");
S.Area(a);
System.out.println("Enter the length and breadth of rectangle");
l=sc.nextInt();
b=sc.nextInt();
System.out.println("Area of rectangle"+" ");
S.Area(l,b);
System.out.println("Enter the base and height of triangle");
m=sc.nextFloat();
h=sc.nextFloat();
System.out.println("Area of triangle"+" ");
S.Area(m,h);
}
}




