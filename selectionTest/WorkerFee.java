package selectionTest;
import  java.util.*;
public class WorkerFee 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String position;
		int worktime;
		int l=12000;
		int sl=20000;
		
		System.out.println("What is your position : ");
		position=sc.nextLine();
		
		System.out.println("What is total amount of work hours in this month : ");
		worktime=sc.nextInt();
		
		if(position.equals("lecturer"))
		{
			if(worktime>160)
			{
				System.out.println("Your salary in this month : "+ (160*l+(worktime-160)*l*1.5));
			}
			else
			{
				System.out.println("Your salary in this month : "+ worktime*l);
			}
		}
		else if(position.equals("senior lecturer"))
		{
			if(worktime>160)
			{
				System.out.println("Your salary in this month : "+ (160*sl+(worktime-160)*sl*1.5));
			}
			else
			{
				System.out.println("Your salary in this month : "+ worktime*sl);
			}
		}
		else
		{
			System.out.println("Wrong User!");
		}
	}
}
