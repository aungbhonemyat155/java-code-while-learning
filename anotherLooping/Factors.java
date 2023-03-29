package anotherLooping;
import java.util.*;
public class Factors 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int ans;
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		System.out.print("Factors of your number are : ");
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0 && i<n)
			{
				ans=i;
				System.out.print(ans+",");
			}
			else if(n%i==0 && i==n)
			{
				ans=i;
				System.out.print(ans);
			}
		}
	}
}
