package arraysLecture;

public class Palindrome 
{
	public static void main(String args[])
	{
		int size=InputArrays.getSize();
		int arr[]=new int[size];
		InputArrays.getArr(arr);
		display(arr);
	}
	
	public static boolean palindrome(int a[])
	{
		int fs=0;
		int ls=a.length-1;
		
		int i=0;
		while(i<a.length/2)
		{
			if(a[fs]!=a[ls])
			{
				return false;
			}
			else
			{
				i++;
				fs++;
				ls--;
			}
		}
		return true;
	}
	
	public static void display(int a[])
	{
		if(palindrome(a)==true)
		{
			System.out.println("Your array is palindrome");
		}
		else
		{
			System.out.println("Your array is not palindrome");
		}
	}
}
