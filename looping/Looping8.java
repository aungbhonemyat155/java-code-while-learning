package looping;
import java.util.*;
public class Looping8 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		for(int i=1;i<=12;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}
