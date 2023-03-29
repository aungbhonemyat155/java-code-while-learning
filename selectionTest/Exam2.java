package selectionTest;
import java.util.*;
public class Exam2 
{
	public static void main(String args[])
	{
		int mya,eng,math;
		Scanner sc=new Scanner(System.in);
		System.out.print("What are your myanmar,english and math exam marks : ");
		mya=sc.nextInt();
		eng=sc.nextInt();
		math=sc.nextInt();
		
		if(mya>=40 && eng>=40 && math>=40)
		{
			System.out.print("You passed exam!");
		}
		else
		{
			System.out.print("You failed exam!");
		}
	}
}
