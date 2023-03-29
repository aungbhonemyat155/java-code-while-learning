package function;
import java.util.*;
public class DtoO 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a decimal number : ");
		n=sc.nextInt();
		
		String ans=oct(n);
		
		System.out.println(n+" of octal number is : "+ans);
	}
	
	public static String oct(int n)
	{
		String ans="";
		for(int i=n;i!=0;i=i/8)
		{
			ans=i%8+ans;
		}
		return ans;
	}
}
