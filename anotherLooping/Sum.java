package anotherLooping;
import java.util.*;
public class Sum 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int sum=0;
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		for(int i=10;n>0;n=n/i)
		{
			sum=sum+n%10;
			
		}
		System.out.println(sum);
	}
}
