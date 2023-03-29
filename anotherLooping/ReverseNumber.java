package anotherLooping;
import java.util.*;
public class ReverseNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		int rn=0;
		for(int i=10;n>0;n=n/i)
		{
			rn=rn*10+n%i;
		}
		System.out.println("Reverse number is "+rn);
	}
}
