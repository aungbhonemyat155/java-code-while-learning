package arraysLecture;

public class BinarySearch 
{
	public static void main(String args[])
	{
		int arr[]= {2,3,5,7,11,13,17,19};
		int n=LinearSearch.userInput();
		int ans=check(arr,n);
		LinearSearch.display(ans);
	}
	
	public static int check(int a[],int b)
	{
		int start=0;
		int last=a.length-1;
		while(start<=last)
		{
			int middle=(start+last)/2;
			if(a[middle]==b)
			{
				return middle;
			}
			else if(a[middle]>b)
			{
				last=middle-1;
			}
			else if(a[middle]<b)
			{
				start=middle+1;
			}
		}
		return -1;
	}
}
