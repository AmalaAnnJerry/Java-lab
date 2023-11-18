import java.util.*;
class Replace
{
	public static void main(String args[])
	{
		int i;
		char c,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String A=sc.next();

		System.out.println("enter character to be replaced");
		c=sc.next().charAt(0);
		System.out.println("enter  new character to be replaced");
		r=sc.next().charAt(0);
		String B=new String();
		for(i=0;i<A.length();i++)
		{
		if(A.charAt(i)==c)
		{	
		B=A.replace(c,r);
		}
		}
		System.out.println("new string is "+B);
	}
}

