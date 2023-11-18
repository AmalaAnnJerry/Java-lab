import java.util.*;
class factor
{
	public static void main(String args[])
	{
		int n,i;
		System.out.println("Enter the number whose factors must be calculated");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		if(n%i==0)
		{
		System.out.println(i+" is a factor");   
		}
		}
	}

}
