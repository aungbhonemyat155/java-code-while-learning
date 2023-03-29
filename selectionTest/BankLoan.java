package selectionTest;
import java.util.*;
public class BankLoan 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String acc;
		float t,d;
		System.out.print("Type of account : ");
		acc=sc.nextLine();
		System.out.print("Loan amount : ");
		d=sc.nextFloat();
		System.out.print("Loan period : ");
		t=sc.nextFloat();
		
		if(acc .equals("normal"))
		{
			if(t<5) 
			{
				System.out.print("Your interest amount of loan : "+ d*15/100*t);
			}
			else 
			{
				System.out.print("Your interest amount of loan : "+ d*17/100*t);
			}
		}
		else if(acc .equals("deluxe"))
		{
			if(t<10)
			{
				System.out.print("Your interest amount of loan : "+ d*14/100*t);
			}
			else if(t>=10 && t<=15)
			{
				System.out.print("Your interest amount of loan : "+ d*16/100*t);
			}
			else
			{
				System.out.print("Your interest amount of loan : "+ d*18/100*t);
			}
		}
		else
		{
			System.out.print("Your interest amount of loan : "+ d*18/100*t);
		}
		
	}
}
