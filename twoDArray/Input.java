package twoDArray;
import java.util.*;
public class Input 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int r=row();
		int c=col();
		int arr[][]=new int[r][c];
		array(arr);
		display(arr);
	}
	
	public static int row()
	{
		int r;
		do {
				System.out.println("Enter number of row : ");
				r=sc.nextInt();
			}while(r<1);
		
		return r;
	}
	
	public static int col()
	{
		int c;
		do {
				System.out.println("Enter number of column : ");
				c=sc.nextInt();
			}while(c<1);
		
		return c;
	}
	
	public static void array(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enter value of ["+i+"]["+j+"] : ");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
	}
	
	public static void display(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
