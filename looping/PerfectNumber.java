package looping;
import java.util.*;
public class PerfectNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		int s=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				s+=i;
			}
		}
		if(n==s)
		{
			System.out.println("Your Number is a perfect Number");
		}
		else
		{
			System.out.println("Your Number is not perfect Number");
		}
	}
}
