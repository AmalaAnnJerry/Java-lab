import java.util.*;
class Search
{
	public static void main(String args[])
	{
		int i,flag=0;
char c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String A=sc.next();
		System.out.println("enter character to be searched");
		c=sc.next().charAt(0);
		for(i=0;i<A.length();i++)
		{
		if(A.charAt(i)==c)
		{	
		flag=1;
		}
		}
if(flag==1)
{
System.out.println("present");
}
else
{
System.out.println("not");
}
}
}
		

	

                                                                                                                    
