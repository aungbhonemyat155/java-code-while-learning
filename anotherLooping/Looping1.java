package anotherLooping;
import java.util.*;
public class Looping1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		
		System.out.print(n+"!"+"=");
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans*=i;
			if(i<n)
			{
				System.out.print(i+"*");
			}
			else
			{
				System.out.print(i+"=");
			}
			
		}
		System.out.print(ans);
	}
}
