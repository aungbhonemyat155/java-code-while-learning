package arraysLecture;

public class TotalAndAverage 
{
	public static void main(String arg[])
	{
		int arr[]= {2,4,6,8,10,12,14};
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			total=total+arr[i];
		}
		System.out.println("Total = "+total);
		double average=(double)total/arr.length;
		System.out.println("Average = "+average);
	}
}
