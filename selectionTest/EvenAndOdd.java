package selectionTest;
import java.util.*;
public class EvenAndOdd 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.print("Your Number is even");
		}
		else
		{
			System.out.print("Your Number is odd");
		}
	}
}
