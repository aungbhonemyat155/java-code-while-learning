package arraysLecture;

public class Repeated 
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
			if(a[i]>=2)
			{
				System.out.println((i+2)+" occurs "+a[i]+" times");
			}
		}
	}
}
