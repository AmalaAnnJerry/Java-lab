import java.util.*;
class frequency
{
	public static void main(String args[])
	{
		int i,k=0;
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String A=sc.next();
		System.out.println("character whose freq must be checked");
		c=sc.next().charAt(0);
	        for(i=0;i<A.length();i++)
		{
		if(A.charAt(i)==c)
		{
		k=k+1;
		}
		}
		System.out.println("present"+" "+k+" times");
	}
}


