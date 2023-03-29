package function;
import java.util.*;
public class DtoB 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a decimal number : ");
		n=sc.nextInt();
		
		String ans=bin(n);
		
		System.out.println(n+" of binary number is : "+ans);
	}
	
	public static String bin(int n)
	{
		String ans="";
		for(int i=n;i!=0;i=i/2)
		{
			ans=i%2+ans;
		}
		return ans;
	}
}
