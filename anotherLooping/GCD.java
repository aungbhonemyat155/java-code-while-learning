package anotherLooping;
import java.util.*;
public class GCD 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter a number : ");
		a=sc.nextInt();
		
		System.out.println("Enter a number : ");
		b=sc.nextInt();
		
		int div=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				div=i;
			}
		}
		System.out.println("GCD of two numbers is : "+div);
	}
}
