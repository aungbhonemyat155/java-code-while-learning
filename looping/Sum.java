package looping;
import java.util.*;
public class Sum 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		for(int i=n;i>0;i=i/10)
		{
			sum=sum+i%10;
			
		}
		System.out.println("the sum of all digit is : "+sum);
		
	}
}
