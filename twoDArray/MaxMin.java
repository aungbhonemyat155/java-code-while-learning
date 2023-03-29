package twoDArray;

public class MaxMin 
{
	public static void main(String args[])
	{
		int r=Input.row();
		int c=Input.col();
		int arr[][]=new int[r][c];
		Input.array(arr);
		int mx=max(arr);
		System.out.println("Maximum number in your array : "+mx);
		int mn=min(arr);
		System.out.println("Minimun number in your array : "+mn);
	}
	
	public static int max(int a[][])
	{
		int max=a[0][0];
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
			}
		}
		return max;
	}
	
	public static int min(int a[][])
	{
		int min=a[0][0];
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(min>a[i][j])
				{
					min=a[i][j];
				}
			}
		}
		return min;
	}
}
