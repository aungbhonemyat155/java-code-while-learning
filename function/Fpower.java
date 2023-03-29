package function;
import java.util.*;
public class Fpower 
{
	public static int power(int b,int p)
	{
		int ans=1;
		for(int i=1;i<=p;i++) 
		{
		ans=ans*b;	
		}
		
		return ans;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		
		System.out.println("enter a base number : ");
		n=sc.nextInt();
		
		System.out.println("enter a power number : ");
		m=sc.nextInt();
		
		int ans=power(n,m);
		
		System.out.println(ans);
	}
}
