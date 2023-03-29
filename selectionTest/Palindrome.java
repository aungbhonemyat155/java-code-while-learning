package selectionTest;
import java.util.*;
public class Palindrome 
{
	public static void main(String args[])
	{
		int n,fd,sd,td,fod;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter four digits : ");
		n=sc.nextInt();
		fd=n/1000;
		sd=n%1000/100;
		td=n%100/10;
		fod=n%10;
		
		if (fd==fod && sd==td)
		{
			System.out.print("Your Number is Palindrome!");
		}
		else
		{
			System.out.print("Your Number is Not Palindrome!");
		}
	}
}
