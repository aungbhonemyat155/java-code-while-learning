package twoDArray;

public class SecondLargest 
{
	public static void main(String args[])
	{
		int r=Input.row();
		int c=Input.col();
		int arr[][]=new int[r][c];
		Input.array(arr);
		int sl=slargest(arr);
		System.out.println("Second Largest value of your array : "+sl);
	}
	
	public static int slargest(int a[][])
	{
		int l,sl;
		if(a[0][0]>a[0][1])
		{
			l=a[0][0];
			sl=a[0][1];
		}
		else
		{
			l=a[0][1];
			sl=a[0][0];
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(l<a[i][j])
				{
					sl=l;
					l=a[i][j];
				}
			}
		}
		return sl;
	}
}
