package arraysLecture;

public class EvenNegativeToPositive 
{
	public static void main(String args[])
	{
		int size=InputArrays.getSize();
		int arr[]=new int[size];
		InputArrays.getArr(arr);
		Swap.original(arr);
		positive(arr);
	}
	
	public static void positive(int a[])
	{
		System.out.print("\nEven positiv array : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%-2==0)
			{
				a[i]=a[i]*-1;
			}
			System.out.print(a[i]+"  ");
		}
	}
}
