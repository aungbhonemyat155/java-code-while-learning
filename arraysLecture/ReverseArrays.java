package arraysLecture;

public class ReverseArrays
{
	public static void main(String args[])
	{
		int size=InputArrays.getSize();
		int s[]=new int[size];
		InputArrays.getArr(s);
		Swap.original(s);
		reverse(s);
	}
	
	public static void reverse(int a[])
	{
		int i=0;
		int firstI=0;
		int lastI=a.length-1;
		while(i<a.length/2)
		{
			int b=a[firstI];
			a[firstI]=a[lastI];
			a[lastI]=b;
		
			i++;
			firstI++;
			lastI--;
		}
		System.out.print("\nReverse array : ");
		for(int f=0;f<a.length;f++)
		{
			System.out.print(a[f]+" ");
		}
	}
}
