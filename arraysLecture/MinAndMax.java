package arraysLecture;

public class MinAndMax 
{
	public static void main(String args[])
	{
		int size=InputArrays.getSize();
		int arr[]=new int[size];
		InputArrays.getArr(arr);
		
		int max=maxv(arr);
		System.out.println("Maximum value of integer in your array is : "+max);
		int min=minv(arr);
		System.out.println("Minimum value of integer in your array is : "+min);
		int maxi=maxIndex(arr);
		System.out.println("Index of maximum number is : "+maxi);
		int mini=minIndex(arr);
		System.out.println("Index of minimum number is : "+mini);
	}
	
	public static int maxv(int a[])
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	
	public static int minv(int a[])
	{
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
	
	public static int maxIndex(int a[])
	{
		int max=a[0];
		int maxi=0;
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				maxi=i;
			}
		}
		return maxi;
	}
	
	public static int minIndex(int a[])
	{
		int min=a[0];
		int mini=0;
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
				mini=i;
			}
		}
		return mini;
	}
}
