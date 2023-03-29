package arraysLecture;
import java.util.*;
public class LinearSearch 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int arr[]={2,4,6,8,10};
		int n=userInput();
		int ans=check(arr,n);
		display(ans);
	}
	
	public static int userInput()
	{
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		
		return n;
	}
	
	public static int check(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void display(int n)
	{
		if(n==-1)
		{
			System.out.println("Your number is in [-1] index");
		}
		else
		{
			System.out.println("Your number is in ["+n+"] index");
		}
	}
}
