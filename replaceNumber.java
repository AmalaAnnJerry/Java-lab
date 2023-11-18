import java.util.*;
class replace
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,j,m;
	System.out.println("enter size of array");
	n=sc.nextInt();
	int A[]=new int[n];
	System.out.println("enter the elements");
	for(i=0;i<n;i++)
	{
	A[i]=sc.nextInt();
	}
	System.out.println("position of element to be replaced");
	j=sc.nextInt();
	System.out.println("new value to be replaced");
	m=sc.nextInt();
	for(i=0;i<n;i++)
	{
		if(i==j)
	{
	A[j-1]=m;
	}
	}
	System.out.println("new array is ");
	
	for(i=0;i<n;i++)
	{
	System.out.println(A[i]);
	}
}
}
	

