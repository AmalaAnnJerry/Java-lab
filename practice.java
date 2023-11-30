import java.util.*;
class Box
{
float l,b,h;
Box(float l,float b,float h)
{
this.l =l;
this.b=b;
this.h =h;
}
void Volume()
{
float vol;
vol=l*b*h;
System.out.println("Volume: "+vol);
}
}

class sample
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter details\n");
System.out.println("LENGTH:\n");
float x=sc.nextFloat();
System.out.println("BREADTH:\n");
float y=sc.nextFloat();
System.out.println("HEIGHT:\n");
float z=sc.nextFloat();
Box b=new Box(x,y,z);
b.Volume();
}
}


