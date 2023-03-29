package newlecture;
import java.util.*;
public class BiggestNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int largest=0;
		int occ=1;
		
		System.out.println("Enter a number:");
		n=sc.nextInt();
		
		while(n!=0)
		{
			n=sc.nextInt();
			if(largest<n)
			{
				largest=n;
			}
			else if(largest==n)
			{
				occ++;
			}
		}
		
		System.out.println("Largest Number is : "+largest);
		System.out.println("The occurrence count of the largest number : "+occ);
	}
}
