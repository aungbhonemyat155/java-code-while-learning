package looping;
import java.util.*;
public class Example 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,f,ld,ans=1,m=1;
		System.out.println("Enter a numbers : ");
		n=sc.nextInt();
		
		ld=n%10;
		f=n;
		for(int div=10;f>9;div=div*10)
		{
			f=n/div;
			m=n%div-ld;
			
			ans=ld*div+m+f;
		}
		System.out.println(ans);
}
	}
