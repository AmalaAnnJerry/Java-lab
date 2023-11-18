import java.util.*;
class Product
{
public static void main(String args[])
{
int m,n,i,j,p,q,k;
Scanner sc=new Scanner(System.in);
System.out.println("enter row and column size of matrix 1");
m=sc.nextInt();
n=sc.nextInt();
System.out.println("enter row and column size of matrix 2");
p=sc.nextInt();
q=sc.nextInt();
int A[][]=new int[m][n];
int B[][]=new int[p][q];
int C[][]=new int[m][q];
if(n!=p)
{
System.out.println("not possible");
}
else
{
System.out.println("enter elements of matrix 1");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
A[i][j]=sc.nextInt();
}
}
System.out.println("enter elements of matrix 2");
for(i=0;i<p;i++)
{
for(j=0;j<q;j++)
{
B[i][j]=sc.nextInt();
}
}
}

for(i=0;i<m;i++)
{
for(j=0;j<q;j++)
{
C[i][j]=0;
for(k=0;k<p;k++)
{
C[i][j]=C[i][j]+A[i][k]*B[k][j];
}
}
}
System.out.println("product is"+" ");
for(i=0;i<p;i++)
{
for(j=0;j<q;j++)
{
System.out.print(C[i][j]+" ");
}
System.out.println();
}
}
}



















