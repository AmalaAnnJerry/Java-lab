import java.util.*;
class Transpose
{
	public static void main(String args[])
	{
		int n,m,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size of matrix");
		m=sc.nextInt();
		System.out.println("enter column size of matrix");
		n=sc.nextInt();
		int A[][]=new int[m][n];
		int B[][]=new int[n][m];
		System.out.println("enter elements");
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
				B[j][i]=A[i][j];
			}
		}		
		System.out.println("transpose of the given matrix is"+" ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
	}
}

		





