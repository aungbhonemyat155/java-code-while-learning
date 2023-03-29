package nestedLoop;

public class Ex15 
{
	public static void main(String args[])
	{
		int l=MirrorPyramid.input();
		display(l);
	}
	
	public static void display(int l)
	{
		int line=l/2;
		int fl=line+1;
		for(int i=0;i<fl;i++)
		{
			for(int j=0;j<fl-i;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int o=0;o<i;o++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<fl-i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=line;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<line-i;k++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<line-i;m++)
			{
				System.out.print(" ");
			}
			for(int o=0;o<=i;o++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
