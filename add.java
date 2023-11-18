import java.util.*;
class add
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,j,m,g,h;
	System.out.println("row size of matrix 1=");
	m=sc.nextInt();
	System.out.println("column size of matrix 1=");
	n=sc.nextInt();
	int A[][]=new int[m][n];
	System.out.println("row size of matrix 2=");
	g=sc.nextInt();
	System.out.println("column size of matrix 2=");
	h=sc.nextInt();
	int B[][]=new int[g][h];

	System.out.println("enter the elements of matrix 1");
	for(i=0;i<m;i++)
	{
	for(j=0;j<n;j++)
	{
	A[i][j]=sc.nextInt();
	}
	}
	System.out.println("enter the elements of matrix 2");
	for(i=0;i<g;i++)
	{
	for(j=0;j<h;j++)
	{
	B[i][j]=sc.nextInt();
	}
	}
int R[][]=new int[m][n];
       if(m!=g||n!=h)
	{
	System.out.println("cannot add");
	}
	else
	{
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
		{



			R[i][j]=A[i][j]+B[i][j];
}
}
}
System.out.println("sum of the matrices is");
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
		{
System.out.print(R[i][j]+" ");
}
System.out.println();
}
}
}















