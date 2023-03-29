package function;
import java.util.*;
public class Prime 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		
		System.out.println("Enter a number : ");
		a=sc.nextInt();
		
		boolean ans=isPrime(a);
		
		if(ans==true)
		{
			System.out.println("Your Number is prime number");
		}
		else
		{
			System.out.println("Your Number is not a prime number");
		}
	}



public static boolean isPrime(int n)
{
	int b=n;
	for(int i=2;i<=n;i++)
	{
		if(n%i==0 && i<n) 
		{
			b=i;
		}
	}
	if(n==b) {
		return true;
	}
	else {
		return false;
	}
}
}
