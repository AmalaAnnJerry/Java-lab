import java.util.*;
class Fibonocci
{
	public static void main(String args[])
	{
		int n,i,g,first=0,sec=1;
		System.out.println("Enter the count");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==1)
		{
		System.out.println("series is"+first);
		}
		else if(n==2)
		{
		System.out.println("series is"+first);
		System.out.println(sec);
		}
		else
		{
		System.out.println(first);
		System.out.println(sec);
		for(i=0;i<n-2;i++)
		{
		g=first+sec;
		System.out.println(g);
		first=sec;
		sec=g;
		}
		}
	}
}

	

