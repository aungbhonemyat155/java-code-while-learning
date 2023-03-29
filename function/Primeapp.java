package function;
import java.util.*;
public class Primeapp 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		
		System.out.println("Enter a number : ");
		a=sc.nextInt();
		
		boolean ans=Prime.isPrime(a);
		
		if(ans==true)
		{
			System.out.println("Your number is prime number");
		}
		else
		{
			System.out.println("Your number is not a prime number");
		}
	}
}
