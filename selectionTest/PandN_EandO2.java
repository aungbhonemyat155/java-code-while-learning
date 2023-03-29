package selectionTest;
import java.util.*;
public class PandN_EandO2 
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number : ");
		n=sc.nextInt();
		
		if(n%2==0)
		{
			if(n<0)
			{
				System.out.print("Your Number is negative and even");
			}
			else
			{
				System.out.print("Your Number is positive and even");
			}
		}
		else
		{
			if(n<0)
			{
				System.out.print("Your Number is negative and odd");
			}
			else
			{
				System.out.print("Your Number is positive and odd");
			}
		}
	}
}
