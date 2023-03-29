package arraysLecture;

public class P_N_MixArray 
{
	public static void main(String args[])
	{
		int size=InputArrays.getSize();
		int arr[]=new int[size];
		InputArrays.getArr(arr);
		display(arr,size);
	}
	
	public static void display(int a[],int size)
	{
		int positive=0,negative=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				positive++;
			}
			else
			{
				negative++;
			}
		}
		if(positive==size)
		{
			System.out.println("Your array's value are all positive.");
		}
		else if(negative==size)
		{
			System.out.println("Your array's value are all negative.");
		}
		else
		{
			System.out.println("Your array's value are mix with positive and negative.");
		}
	}
}
