package newlecture;
import java.util.*;
public class LowerLimitUpperLimit 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int up,low;
		
		System.out.println("Enter a lower limit : ");
		low=sc.nextInt();
		
		System.out.println("Enter a upper limit : ");
		up=sc.nextInt();
		
		int count=0;
		for(int i=low;i<=up;i++)
		{
			if(i%2==0 && i%3==0)
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
}
