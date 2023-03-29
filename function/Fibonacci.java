package function;
import java.util.*;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int f,s,g;
		
		System.out.println("Enter a first number : ");
		f=sc.nextInt();
		
		System.out.println("Enter a second number : ");
		s=sc.nextInt();
		
		System.out.println("Enter a greatest number : ");
		g=sc.nextInt();
		
		System.out.print("Fibonacci series of your numbers : "+f+" "+s );
		
		String ans=fib(f,s,g);
		
		System.out.println(ans);
		
	}
	public static String fib(int f,int s,int g)
	{
		int t=0;
		String ans="";
		for(int i=1;f+s<g;i++)
		{
			t=f+s;
			f=s;
			s=t;
			
			ans=ans+" "+t;
		}
		return ans;
	}
}
