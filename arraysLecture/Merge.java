package arraysLecture;
import java.util.*;
public class Merge 
{ 
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int arr1[]={1,2,3,4,5};
		int arr2[]={11,12,13,14,15};
		System.out.print("Array 1 : ");
		display(arr1);
		System.out.print("\nArray 2 : ");
		display(arr2);
		int marr[]=merge(arr1,arr2);
		System.out.print("\nMerge Array : ");
		display(marr);
	}
	
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static int[] merge(int a[],int b[])
	{
		int marr[]=new int[a.length+b.length];
		int i=0,ai=0,bi=0;
		int ac=0,bc=0;
		while(ai<a.length)
		{
			if(a[ai]%2!=0)
			{
				marr[i]=a[ai];
				i++;
				ai++;
			}
			else
			{
				ai++;
			}
		}
		while(bi<b.length)
		{
			if(b[bi]%2!=0)
			{
				marr[i]=b[bi];
				i++;
				bi++;
			}
			else
			{
				bi++;
			}
		}
		while(ac<a.length)
		{
			if(a[ac]%2==0)
			{
				marr[i]=a[ac];
				i++;
				ac++;
			}
			else
			{
				ac++;
			}
		}
		while(bc<a.length)
		{
			if(b[bc]%2==0)
			{
				marr[i]=b[bc];
				i++;
				bc++;
			}
			else
			{
				bc++;
			}
		}
		return marr;
	}
}