package looping;
import java.util.*;
public class Looping3 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number which can divided by 5 : ");
		n=sc.nextInt();
		int count=0;
		for(int i=0;i<=n;i+=5) 
		{
			System.out.print(i+"\t");
			count++;
			if(count%5==0)
			{
				System.out.println();
			}
		}
	}
}
