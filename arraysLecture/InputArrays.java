package arraysLecture;
import java.util.*;
public class InputArrays 
{
	static Scanner sc=new Scanner(System.in);
	
	public static int getSize()
	{
		int size;
		System.out.print("Enter the size of array : ");
		size=sc.nextInt();
		
		return size;
	}
	
	public static void getArr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value of array ["+i+"] : ");
			a[i]=sc.nextInt();
		}
	}
	
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The value of array["+i+"] : "+a[i]);
		}
	}
	
	public static void main(String args[])
	{
		int size=getSize();
		int arr[]=new int[size];
		getArr(arr);
		display(arr);
	}
}
