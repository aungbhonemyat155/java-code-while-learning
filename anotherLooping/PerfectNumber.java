package anotherLooping;
import java.util.*;
public class PerfectNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int sum=0;
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("Your number is a perfect number");
		}
		else
		{
			System.out.println("Your number is not a perfect number");
		}
	}
}
