package arraysLecture;
import java.util.*;
public class OneTo100 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int arr[]=input();
		display(arr);
	}
	
	public static int[] input()
	{
		int n=1;
		int arr[]=new int[98];
		Distinct.zero(arr);
		System.out.print("Enter any integers between 1 and 100 : ");
		while(n!=0)
		{
			n=sc.nextInt();
			if(n>0)
			{
				arr[n-2]++;
			}
		}
		return arr;
	}
	
	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				if(arr[i]==1)
				{
					System.out.println((i+2)+" occurs "+arr[i]+" time");
				}
				else
				{
					System.out.println((i+2)+" occurs "+arr[i]+" times");
				}
			}
		}

	}
}
