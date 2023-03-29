package function;
import java.util.*;
public class BiggestNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a integer,the input ends if it is 0 : ");
		while((n=sc.nextInt())!=0)
		{
			System.out.println(n);
		}
		
		
		int largest=largest(n);
		int occ=occ(n);
		System.out.println("Largest number is : "+largest);
		System.out.println("The occurrence count of the largest number is "+occ);
	}	
	
	public static int largest(int n)
	{
		
		
		int largest=0;
		while(n>0)
		{
			if(largest<=n)
			{
				largest=n;
			}
		}
		return largest;
	}
	
	public static int occ(int n)
	{
		
		int occ=0;
		while(n!=0)
		{
			if(largest(n)==n)
			{
				occ++;
			}
		}
		return occ;
	}
}
