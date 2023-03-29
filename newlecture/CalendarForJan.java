package newlecture;
import java.util.*;
public class CalendarForJan
{
	public static void main (String args[])
	{

	int day;
	int year;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter year : ");
	year=sc.nextInt();
	System.out.println("Enter day (sunday=0,monday=1,etc.) : ");
	day=sc.nextInt();
	
	System.out.println("January "+year);
	
	System.out.println("Sun\tMon\tTue\tWed\tThur\tFri\tSat\t");
	
	int count=0;
	int i=1;
	while(i<=31)
	{
		count++;
	if(day==0)	
	{
		System.out.print(i+"\t");
	}
	else if(day==1)
	{
		if(count<=1)
		{
			System.out.print("\t");
		}
		else
		{
			System.out.print(i+"\t");
			i++;
		}
	}
	else if(day==2)
	{
		if(count<=2)
		{
			System.out.print("\t");
		}
		else
		{
			System.out.print(i+"\t");
			i++;
		}
	}
	else if(day==3)
	{
		if(count<=3)
		{
			System.out.print("\t");
		}
		else
		{
			System.out.print(i+"\t");
			i++;
		}
	}
	else if(day==4)
	{
		if(count<=4)
		{
			System.out.print("\t");
		}
		else
		{
			System.out.print(i+"\t");
			i++;
		}
	}
	else if(day==5)
	{
		if(count<=5)
		{
			System.out.print("\t");
		}
		else
		{
			System.out.print(i+"\t");
			i++;
		}	
	}
	else if(day==6)
	{
		if(count<=6)
		{
			System.out.print("\t");
		}
		else
		{
			System.out.print(i+"\t");
			i++;
		}
	}
	
	if(count%7==0)
	{
		System.out.println();
	}
	}
	
	}
}
