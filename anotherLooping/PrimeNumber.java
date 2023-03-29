package anotherLooping;
import java.util.*;
public class PrimeNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		int ans=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				ans=i;
			}
		}
		if(ans==0)
		{
			System.out.println("Your Number is a prime number");
		}
		else
		{
			System.out.println("Your Number is not a prime number");
		}
	}
}
