package function;
import java.util.*;
public class CombinationTest 
{
	public static int fact(int n)
	{
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans*=i;
		}
		return ans;
	}


	public static int com(int n,int r)
	{
		return fact(n)/(fact(r)*fact(n-r));
	}
	
	public static void main(String args[])
	{
		int n,r;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		System.out.println("Enter a number : ");
		r=sc.nextInt();
		
		int li=com(n,r);
		
		System.out.println("Your answer is : "+li);
	}
}
