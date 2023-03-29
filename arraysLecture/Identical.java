package arraysLecture;

public class Identical
{
	public static void main(String args[])
	{
		int size=InputArrays.getSize();
		int arr[]=new int[size];
		InputArrays.getArr(arr);
		
		int size2=InputArrays.getSize();
		int s[]=new int[size2];
		InputArrays.getArr(s);
		
		boolean identical=identical(arr,s);
		display(identical);
		
	}
	
	public static boolean identical(int a[],int b[])
	{
		if(a.length!=b.length)
		{
			return false;
		}
		else
		{
			int i=0;
			while(i<a.length)
			{
				if(a[i]!=b[i])
				{
					return false;
				}
				i++;
			}
		}
		return true;
	}
	
	public static void display(boolean i)
	{
		if(i==true)
		{
			System.out.println("Your two arrays are identical");
		}
		else
		{
			System.out.println("Your two arrays are not identical");
		}
	}
}
