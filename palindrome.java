import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		int i,flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String A=sc.next();
                
		for(i=0;i<A.length()/2;i++)
		{
		if(A.charAt(i)!=A.charAt(A.length()-i-1))
		{
		flag=0;
		break;
		}
		}
if(flag==0)
{
System.out.println("String is not palindrome");
}
else
{
System.out.println("string is a palindrome");
}
}
}



