package arraysLecture;
import java.util.*;
public class Score 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int num=number();
		int arr[]=new int[num];
		score(arr,num);
		compare(arr);
	}
	
	public static int number()
	{
		int number;
		System.out.print("Enter number of students : ");
		number=sc.nextInt();
		
		return number;
	}
	
	public static void score(int a[],int n)
	{
		System.out.print("Enter "+n+" scores : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	public static int bestScore(int a[])
	{
		int best=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(best<a[i])
			{
				best=a[i];
			}
		}
		return best;
	}
	
	public static void compare(int a[])
	{
		int best=bestScore(a);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=best-10)
			{
				System.out.println("Student "+i+" score is "+a[i]+" and grade is A");
			}
			else if(a[i]>=best-20)
			{
				System.out.println("Student "+i+" score is "+a[i]+" and grade is B");
			}
			else if(a[i]>=best-30)
			{
				System.out.println("Student "+i+" score is "+a[i]+" and grade is C");
			}
			else if(a[i]>=best-40)
			{
				System.out.println("Student "+i+" score is "+a[i]+" and grade is D");
			}
			else
			{
				System.out.println("Student "+i+" score is "+a[i]+" and grade is F");
			}
		}
	}
}
