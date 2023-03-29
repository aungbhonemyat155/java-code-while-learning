package looping;
import java.util.*;
public class Looping4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		
		int count=0;
		for(int i=n;i>=0;i--)
		{
			System.out.print(i+"\t");
			count++;
			if(count%10==0)
			{
				System.out.println();
			}
		}
	}
}
