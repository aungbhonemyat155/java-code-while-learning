package nestedLoop;
import java.util.*;
public class MirrorPyramid 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		int line=input();
		display(line);
	}
	
	public static int input()
	{
		int n=0;
		while(n%2==0)
		{
			System.out.print("Enter line number : ");
			n=sc.nextInt();
		}
		return n;
	}
	
	public static void display(int a)
	{
		int line=a/2;
		int fl=line+1;
		for(int i=0;i<fl;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<fl-i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=line;i++)
		{
			for(int j=0;j<line-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
