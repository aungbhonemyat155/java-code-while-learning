package twoDArray;

public class Total 
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},{4,5,6}};
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				total=total+arr[i][j];
			}
		}
		System.out.println("Total is : "+total);
		int count=count(arr);
		double avg=(double)total/count;
		System.out.println("Count is : "+count);
		System.out.println("Average : "+avg);
	}
	
	public static int count(int a[][])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count=count+a[i].length;
		}
		return count;
	}
}
