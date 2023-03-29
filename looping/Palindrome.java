package looping;
import java.util.*;
public class Palindrome 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rn=0;
		System.out.println("enter a number : ");
		n=sc.nextInt();
		
		for(int i=n;i!=0;i=i/10)
		{
			rn=rn*10+i%10;
		}
		if(n==rn) 
		{
			System.out.println("your number is palindrome ");
		}
		else
		{
			System.out.println("your number is not palindrome");
		}
	}
}
