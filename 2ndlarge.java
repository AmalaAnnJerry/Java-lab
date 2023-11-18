import java.util.*;
class large2
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,j,t;
	System.out.println("enter size of array");
	n=sc.nextInt();
	int A[]=new int[n];
	System.out.println("enter the elements");
	for(i=0;i<n;i++)
	{
	A[i]=sc.nextInt();
	}
	for(i=0;i<n-1;i++)
        {
	for(j=0;j<n-i-1;j++)
	{
	if(A[j]>A[j+1])
	{
	t=A[j];
	A[j]=A[j+1];
	A[j+1]=t;
	}
	}
}
System.out.println("2nd largest element is"+" "+A[n-2]);


}
}



