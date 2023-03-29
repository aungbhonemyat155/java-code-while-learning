package selectionTest;
import java.util.*;
public class PandN_EandO3 
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		n=sc.nextInt();
		
		if(n<0)
		{
			if(n%2==0)
			{
				System.out.print("Your Number is negative and even");
			}
			else
			{
				System.out.print("Your Number is negative and odd");
			}
			
		}
		else
		{
			if(n%2==0)
			{
				System.out.print("Your Number is positive and even");
			}
			else
			{
				System.out.print("Your Number is positive and odd");
			}
		}
	}
}
