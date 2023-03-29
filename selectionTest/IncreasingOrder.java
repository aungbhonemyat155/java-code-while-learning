package selectionTest;
import java.util.*;
public class IncreasingOrder 
{
	public static void main(String arg[])
	{
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Three Digits And Space Between Them : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		if(n1<=n2 && n2<=n3)
		{
			System.out.print(n1+","+n2+","+n3);
		}
		else if(n1<=n3 && n3<=n2)
		{
			System.out.print(n1+","+n3+","+n2);
		}
		else if(n2<=n1 && n1<=n3)
		{
			System.out.print(n2+","+n1+","+n3);
		}
		else if(n2<=n3 && n3<=n1)
		{
			System.out.print(n2+","+n3+","+n1);
		}
		else if(n3<=n1 && n1<=n2)
		{
			System.out.print(n3+","+n1+","+n2);
		}
		else 
		{
			System.out.print(n3+","+n2+","+n1);
		}
		
	}
}
