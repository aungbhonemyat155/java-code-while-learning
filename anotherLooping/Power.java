package anotherLooping;
import java.util.*;
public class Power 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int b,p;
		int ans=1;
		
		System.out.println("Enter a base number : ");
		b=sc.nextInt();
		
		System.out.println("Enter a power number : ");
		p=sc.nextInt();
		
		for(int i=1;i<=p;i++)
		{
			ans=ans*b;
		}
		System.out.println("Result : "+ans);
	}
}
