class Exception
{
public static void main(String args[])
{
try
{
int a=25/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
System.out.println("Task 1 is completed");
}
try
{
int b[]=new int[6];
b[6]=6;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
System.out.println("Task 2 is completed");
}
System.out.println("Rest of the code");
}
}
