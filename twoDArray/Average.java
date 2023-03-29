package twoDArray;

public class Average 
{
	public static void main(String args[])
	{
		int r=Input.row();
		int c=Input.col();
		int arr[][]=new int[r][c];
		Input.array(arr);
		int t=total(arr);
		display(arr);
	}
	
	public static int total(int a[][])
	{
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				total+=a[i][j];
			}
		}
		return total;
	}
	
	public static void display(int a[][])
	{
		int positive=0;
		int negative=0;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				count++;
				if(a[i][j]<0)
				{
					negative++;
				}
				else
				{
					positive++;
				}
			}
		}
		double avg=(double)total(a)/count;
		
		System.out.println("Sum of your array : "+total(a));
		System.out.println("Positive number count in your array : "+positive);
		System.out.println("Negative number count in your array : "+negative);
		System.out.println("Average of your array : "+avg);
	}
}
