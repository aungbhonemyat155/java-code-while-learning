package selectionTest;
import java.util.*;
public class ValidDate 
{
	public static void main(String args[])
	{
		int d,m,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Day , Month and Year : ");
		d=sc.nextInt();
		m=sc.nextInt();
		y=sc.nextInt();
		
		if(m==2 && y%4==0 && y%100!=0 || y%400==0)
		{
			if(d<=29) 
			{
				System.out.println("Your date is valid!");
			}
			else
			{
				System.out.println("Your date is invalid!");
			}
			
		}
		else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
		{
			if(d<=31)
			{
				System.out.println("Your date is valid!");
			}
			else
			{
				System.out.println("Your date is invalid!");
			}
		}
		else if(m==4 || m==6 || m==9 || m==11)
		{
			if(d<=30)
			{
				System.out.println("Your date is valid!");
			}
			else
			{
				System.out.println("Your date is invalid!");
			}
		}
		else
		{
			System.out.println("Your date is invalid!");
		}
	}
}
