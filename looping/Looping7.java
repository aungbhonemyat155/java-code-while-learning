package looping;
import java.util.*;
public class Looping7 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		int i=1;
		do 
		{
			System.out.println(n+" * "+i+" = "+(n*i));
			i++;
		}while(i<=12);
	}
}
