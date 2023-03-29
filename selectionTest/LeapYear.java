package selectionTest;
import java.util.*;
public class LeapYear 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Year : ");
		n=sc.nextInt();
		
		if((n%4==0 && n%100!=0)||(n%400==0))
		{
			System.out.print("This Is Leap Year!");
		}
		else
		{
			System.out.print("This Is Not Leap Year!");
		}
	}
}
