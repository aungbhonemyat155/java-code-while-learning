package nestedLoop;

public class HeartStar 
{
	public static void main(String args[])
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			for(int j=0;j<1-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<5-i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
