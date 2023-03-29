package arraysLecture;

public class FirstRepeated 
{
	public static void main(String args[])
	{
		int number=ElementOccurrence.nelement();
		int arr[]=new int[number];
		ElementOccurrence.array(arr);
		int repeat=fRepeat(arr);
		display(repeat);
	}
	
	public static int fRepeat(int a[])
	{
		int b=0;
		int i=1;
		int repeat=-1;
		while(b<a.length-1 )
		{
			if(a[b]==a[i])
			{
				repeat=a[b];
				return repeat;
			}
			else if(i<a.length)
			{
				i++;
			}
			if(i>=a.length)
			{
				b++;
				i=1+b;
			}
		}
		return repeat;
	}
	
	public static void display(int n)
	{
		if(n==-1)
		{
			System.out.print("There is no repeat number");
		}
		else
		{
			System.out.print("First repeated element is : "+n);
		}
	}
}
