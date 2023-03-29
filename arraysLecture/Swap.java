package arraysLecture;

public class Swap 
{
	public static void main(String args[])
	{
		int size=InputArrays.getSize();
		int s[]=new int[size];
		InputArrays.getArr(s);
		original(s);
		swap(s);
	}
	
	public static void original(int b[])
	{
		System.out.print("Oringinal arrays : ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	
	public static void swap(int b[])
	{
		int maxindex=MinAndMax.maxIndex(b);
		int minindex=MinAndMax.minIndex(b);
		int i=b[maxindex];
		b[maxindex]=b[minindex];
		b[minindex]=i;
		
		System.out.print("\nSwapped arrays : ");
		for(int f=0;f<b.length;f++)
		{
			System.out.print(b[f]+" ");
		}
	}
}
