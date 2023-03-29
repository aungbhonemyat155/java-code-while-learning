package looping;
import java.util.*;
public class GCD 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x,y,gcd=1;
		System.out.println("enter a number : ");
		x=sc.nextInt();
		
		System.out.println("enter a number : ");
		y=sc.nextInt();
		
		for(int i=1;i<=y && i<=x;i++)
		{
			if(y%i==0 && x%i==0)
			{
				gcd=i;
			}
			
		}
		System.out.println("GCD is "+gcd);
	}
}