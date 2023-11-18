import java.util.*;
class swap
{
	public static void main(String args[])
	{
		int a,b,t;
		System.out.println("Enter the value of a");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		t=a;
		a=b;
		b=t;
		System.out.println("new value of a is"+a);
		System.out.println("new value of b is"+b);
	}
}
		
		
		
