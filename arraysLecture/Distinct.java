package arraysLecture;
import java.util.*;
public class Distinct 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int arr[]=new int[10];
		input(arr);
		int biggest=biggest(arr);
		int count[]=new int[biggest];
		zero(count);
		distinct(arr,count);
		int dcount=distinctCount(count);
		System.out.print("the number of distinct number : "+dcount);
		distinctn(count);
	}
	
	public static void input(int a[])
	{
		System.out.print("Enter ten numbers : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	public static void zero(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=0;
		}
	}
	
	public static int biggest(int a[])
	{
		int big=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
		}
		return big;
	}
	
	public static void distinct(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			b[a[i]-1]++;
		}
	}
	
	public static int distinctCount(int b[])
	{
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>0)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void distinctn(int b[])
	{
		System.out.print("\nthe distinct numbers are : ");
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>0)
			{
				System.out.print(i+1+" ");
			}
		}
	}
}
