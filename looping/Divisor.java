package looping;
import java.util.*;
public class Divisor 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		int ans;
		System.out.print(n+" is divisible by");
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+",");
			}
		}
	}
}
