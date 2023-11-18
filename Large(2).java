import java.util.*;
class Large
{
	public static void main(String args[])
	{
		int a,b;
		System.out.println("Enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("largest is"+a);
		}
		else
		{
			System.out.println("largest is"+b);
		}
	}		
}	
