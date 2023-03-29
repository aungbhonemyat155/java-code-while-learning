package selectionTest;
import java.util.*;
public class Commissions 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		float s;
		
		System.out.println("What is your name?");
		name=sc.nextLine();
		System.out.println("What is the amount of total sale for a month : ");
		s=sc.nextFloat();
		
		if(s>=1 && s<=1000)
		{
			System.out.print("Your commission is : "+ s*2/100);
		}
		else if(s>=1001 && s<=5000)
		{
			System.out.print("Your commission is : "+ s*5/100);
		}
		else
		{
			System.out.print("Your commission is : "+ s*10/100);
		}
	}
}
