import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int a,n,r=0;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a!=0)
		{
		n=a%10;
		r=r*10+n;
		a=a/10;
		}
		System.out.println("reverse is "+r);

	}
}



		
		
		
		
