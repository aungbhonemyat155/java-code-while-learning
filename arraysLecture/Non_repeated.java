package arraysLecture;

public class Non_repeated 
{
	public static void main(String args[])
	{
		int arr[]=OneTo100.input();
		display(arr);
	}
	
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<2 && a[i]>0)
			{
				System.out.println((i+2)+" occurs "+a[i]+" time");
			}
		}
	}
}
