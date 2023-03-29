package function;
import java.util.*;
public class OnebyN 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		String out=out(n);
		System.out.println("Expected Output : "+out);
		
		double ans=sum(n);
		
		System.out.println("Your answer is : "+ans);
	}
	
	public static double sum(int n)
	{
		double ans=0;
		for(double i=1;i<=n;i++)
		{
			ans=ans+1/i;
		}
		return ans;
	}
	
	public static String out(int n)
	{
		String ans="";
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				ans=ans+1;
			}
			else
			{
				ans=ans+" + 1/"+i;
			}
		}
		return ans;
	}
}
