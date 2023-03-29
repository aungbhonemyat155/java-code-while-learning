package looping;
import java.util.*;
public class Power 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		
		System.out.println("Enter base number : ");
		a=sc.nextInt();
		
		System.out.println("Enter power number : ");
		b=sc.nextInt();
		
		int ans=1;
		for(int i=1;i<=b;i++)
		{
			ans=ans*a;
		}
		System.out.println("Answer is "+ans);
	}
}
