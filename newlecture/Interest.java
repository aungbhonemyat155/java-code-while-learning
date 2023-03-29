package newlecture;
import java.util.*;
public class Interest 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double rate,amount,month,monthlyrate;
		
		System.out.println("Enter your monthly saving amount : ");
		amount=sc.nextInt();
		
		System.out.println("Enter your annual interest rate : ");
		rate=sc.nextInt();
		
		System.out.println("Enter the number of month you are saving : ");
		month=sc.nextInt();
		
		monthlyrate=(rate/100)/12;
		
		int i=1;
		double money=0;
		while(i<=month)
		{
			money=money+amount;
			money=money+(money*monthlyrate);
			System.out.println("The value in your account in "+i+" month : \n"+money);
			i++;
		}
	}
}
