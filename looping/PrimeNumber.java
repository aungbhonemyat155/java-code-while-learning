package looping;
import java.util.*;
public class PrimeNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n,m=0;
		
		System.out.println("enter a number : ");
		n=sc.nextInt();
		
		for(int i=2;i<=n;i++)
		{
			if(n%i==0 && i<n) 
			{
				m=i;
			}
		}
		if(n<2) 
		{
			System.out.println("your number is not a prime number");
		}
		else if(m==0) 
		{
			System.out.println("your number is a prime number");
		}
		else 
		{
			System.out.println("your number is not a prime number");
		}
	}
}
