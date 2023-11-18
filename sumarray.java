import java.util.*;
class sumarray
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,s=0;
	System.out.println("enter size of array");
	n=sc.nextInt();
	int A[]=new int[n];
	System.out.println("enter the elements");
	for(i=0;i<n;i++)
	{
	A[i]=sc.nextInt();
	}

	for(i=0;i<n;i++)
	{
	s=s+A[i];
	}
	System.out.println("the sum is"+" "+s);
	
	
	
}
}
	

