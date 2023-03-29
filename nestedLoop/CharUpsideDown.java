package nestedLoop;
import java.util.*;
public class CharUpsideDown 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String arg[])
	{
		int lineN=line();
		int count=character(lineN);
		System.out.println(count);
		display(lineN,count);
	}
	
	public static int line()
	{
		System.out.println("Enter number of line : ");
		int n=sc.nextInt();
		
		return n;
	}
	
	public static int character(int a)
	{
		int cCount=0;
		for(int i=1;i<=a;i++)
		{
			cCount=cCount+i;
		}
		return cCount;
	}
	
	public static void display(int l,int a)
	{
		char c=(char) (96+a);
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l-i;j++)
			{
				System.out.print(c);
				c--;
			}
			System.out.println();
		}
	}
}
