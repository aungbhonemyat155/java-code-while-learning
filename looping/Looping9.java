package looping;
import java.util.*;
public class Looping9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int c=1;
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		System.out.print(n+"!"+"=");
		for(int i=1;i<=n;i++)
		{
			c=c*i;
			if(i<n)
			{
				System.out.print(i+"*");
			}
			else
			{
				System.out.print(i+"=");
			}
		}
		System.out.println(c);
	}
}
