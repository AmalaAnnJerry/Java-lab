import java.util.*;
class trace
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,j,s=0,m;
	System.out.println("enter row size");
	m=sc.nextInt();
	System.out.println("enter column size");
	n=sc.nextInt();
	int A[][]=new int[m][n];
	System.out.println("enter the elements");
	for(i=0;i<m;i++)
	{
	for(j=0;j<n;j++)
	{
	A[i][j]=sc.nextInt();
	}
	}
	for(i=0;i<m;i++)
	{
	for(j=0;j<n;j++)
	{
	if(i==j)
	{
	s=s+A[i][j];
	}
	}
	}
	System.out.println("trace ="+" "+s);
	
}
}

