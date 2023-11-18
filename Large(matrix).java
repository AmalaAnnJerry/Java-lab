import java.util.*;
class matrix
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,j,l;
	System.out.println("enter same row and column size");
	n=sc.nextInt();
	
	int A[][]=new int[n][n];
	System.out.println("enter the elements");
	for(i=0;i<n;i++)
	{
	for(j=0;j<n;j++)
	{
	A[i][j]=sc.nextInt();
	}
	}
	l=A[0][0];
	for(i=0;i<n;i++)
	{
	for(j=0;j<n;j++)
	{
	if(A[i][j]>l)
{
l=A[i][j];
}
}
}
System.out.println("largest element is"+" "+l);
}
}

