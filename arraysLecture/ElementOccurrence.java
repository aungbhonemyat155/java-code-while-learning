package arraysLecture;
import java.util.*;
public class ElementOccurrence 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int number=nelement();
		int arr[]=new int[number];
		array(arr);
		int n;
		System.out.print("Enter number to find occurrence : ");
		n=sc.nextInt();
		occurrence(n,arr);
	}
	
	public static int nelement()
	{
		System.out.print("Enter the number of element : ");
		int n=sc.nextInt();
		
		return n;
	}
	
	public static void array(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter element "+(i+1)+" : ");
			a[i]=sc.nextInt();
		}
	}
	
	public static void occurrence(int n,int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Occurrence of "+n+" is : 0");
		}
		else
		{
			System.out.println("Occurrence of "+n+" is : "+count);
		}
	}
}
