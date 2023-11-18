import java.util.*;
class smallest
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,s;
	System.out.println("enter size of array");
	n=sc.nextInt();
	int A[]=new int[n];
	System.out.println("enter the elements");
	for(i=0;i<n;i++)
	{
	A[i]=sc.nextInt();
	}
	s=A[0];
	for(i=0;i<n;i++)
	{
	if(A[i]<s)
	{
	s=A[i];
	}
	}
	System.out.println("smallest element is"+" "+s);
	
}
}

