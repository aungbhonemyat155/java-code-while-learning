package arraysLecture;
import java.util.*;
public class CharReverse 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int size=InputArrays.getSize();
		char arr[]=new char[size];
		inputArray(arr);
		original(arr);
		reverse(arr);
	}
	
	public static void inputArray(char a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value of array ["+i+"] : ");
			a[i]=sc.next().charAt(0);
			
		}
	}
	
	public static void original(char a[])
	{
		System.out.print("Original array : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void reverse(char a[])
	{
		int i=0;
		int firstI=0;
		int lastI=a.length-1;
		while(i<a.length/2)
		{
			char b=a[firstI];
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
