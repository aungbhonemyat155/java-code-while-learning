package selectionTest;
import java.util.*;
import java.io.*;
public class Exam 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int mark;
		System.out.print("What is your exam mark : ");
		mark=sc.nextInt();
		
		if(mark>=40) 
		{
			System.out.println("You passed the exam");
		}
		else
		{
			System.out.println("You failed the exam");
		}
	}
	
}

