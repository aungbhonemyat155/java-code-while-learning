package selectionTest;
import java.util.*;
public class PandNEandO 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		n=sc.nextInt();
		
		if(n<0 && n%2==0)
		{
			System.out.print("Your Number is negative and even");
		}
		else if(n<0 && n%2!=0)
		{
			System.out.print("Your Number is negative and odd");
		}
		else if(n>0 && n%2==0)
		{
			System.out.print("Your Number is positive and even");
		}
		else 
		{
			System.out.print("Your Number is positive and odd");
		}
	}
}
