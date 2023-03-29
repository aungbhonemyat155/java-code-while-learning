package anotherLooping;
import java.util.*;
public class Palindrome 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int rn=0;
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		int r=n;
		for(int i=10;r>0;r=r/10)
		{
			rn=rn*10+r%i;
		}
		System.out.println("Your reverse number is "+rn);
		
		if(n==rn)
		{
			System.out.println("Your number is palindrome");
		}
		else
		{
			System.out.println("Your number is not palindrome");
		}
	}
}
