package selectionTest;
import java.util.*;
public class NegativeAndPositive 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		n=sc.nextInt();
		
		if(n<0)
		{
			System.out.print("Your Number is Negative");
		}
		else
		{
			System.out.print("Your Number is Positive");
		}
	}
}
