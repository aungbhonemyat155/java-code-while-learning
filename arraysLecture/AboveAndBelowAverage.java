package arraysLecture;
import java.util.*;
public class AboveAndBelowAverage
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int arr[]=new int[100];
		score(arr);
		double average=average(arr);
		int aboveAverage=aboveAvg(arr,average);
		int belowAverage=belowAvg(arr,average);
		
		
		System.out.println("Average of your array : "+average);
		
		System.out.println("Number of score above or equal average : "+aboveAverage);
		
		System.out.println("Number of score below average : "+belowAverage);
	}
	
	public static void score(int a[])
	{
		System.out.print("Enter Scores : ");
		int i=0;
		do
		{
			a[i]=sc.nextInt();
			i++;
		}while(a[i-1]>0);
	}
	
	public static double average(int a[])
	{
		int total=0;
		double avg=0;
		int count=0;
		for(int i=0;a[i]>0;i++)
		{
			total=total+a[i];
			count++;
		}
		avg=(double)total/count;
		return avg;
	}
	
	public static int aboveAvg(int a[],double b)
	{
		int count=0;
		for(int i=0;a[i]>0;i++)
		{
			if(a[i]>=b)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int belowAvg(int a[],double b)
	{
		int count=0;
		for(int i=0;a[i]>0;i++)
		{
			if(a[i]<b)
			{
				count++;
			}
		}
		return count;
	}
}
