package selectionTest;
import java.util.*;
public class Profit 
{
	public static void main(String args[])
	{
		String it;
		float pc;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Type : ");
		it=sc.nextLine();
		System.out.print("Enter Price : ");
		pc=sc.nextFloat();
		
		
		
		if(it .equals("clothe"))
		{
			if(pc<20) 
			{
				System.out.print("Your Profit is : "+ pc*10/100);
			}
			else if(pc>=20 && pc<=50)
			{
				System.out.print("Your Profit is : "+ pc*15/100);
			}
			else
			{
				System.out.print("Your Profit is : "+ pc*20/100);
			}
		}
		else if(it .equals("shoe"))
		{
			if(pc<5 || pc>30)
			{
				System.out.print("Your Profit is : "+ pc*5/100);
			}
			else
			{
				System.out.print("Your Profit is : "+pc*10/100);
			}
		}
		else
		{
			System.out.print("Wrong Type!");
		}
	}
}
