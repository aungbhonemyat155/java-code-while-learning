package nestedLoop;

public class Number4 
{
	
	public static void main(String args[])
	{
		char like='a';
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(like);
				like++;
			}
			System.out.println();
		}	
	}
}

