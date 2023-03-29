package selectionTest;
import java.util.*;
public class Day 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n,nn,m;
		System.out.print("Enter Today's Day : ");
		n=sc.nextInt();
		
		System.out.print("Enter The Number Of Days Elapsed Since Today : ");
		nn=sc.nextInt();
		m=n+nn;
		
		if(n%7==0)
		{
			System.out.print("Today is Sunday");
		}
		else if(n%7==1) 
		{
			System.out.print("Today is Monday");
		}
		else if(n%7==2)
		{
			System.out.print("Today is Tuesday");
		}
		else if(n%7==3)
		{
			System.out.print("Today is Wednesday");
		}
		else if(n%7==4)
		{
			System.out.print("Today is Thursday");
		}
		else if(n%7==5)
		{
			System.out.print("Today is Friday");
		}
		else
		{
			System.out.print("Today is Saturday");
		}
		
		if(m%7==0)
		{
			System.out.print(" And The Future Day is Sunday!");
		}
		else if(m%7==1) 
		{
			System.out.print(" And The Future Day is Monday!");
		}
		else if(m%7==2)
		{
			System.out.print(" And The Future Day is Tuesday!");
		}
		else if(m%7==3)
		{
			System.out.print(" And The Future Day is Wednesday!");
		}
		else if(m%7==4)
		{
			System.out.print(" And The Future Day is Thursday!");
		}
		else if(m%7==5)
		{
			System.out.print(" And The Future Day is Friday!");
		}
		else
		{
			System.out.print(" And The Future Day is Saturday!");
		}
	}
}
