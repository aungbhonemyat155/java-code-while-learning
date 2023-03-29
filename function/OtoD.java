package function;
import java.util.*;
public class OtoD 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a octal number : ");
		n=sc.nextInt();
		
		int ans=dec(n);
		
		System.out.println(n+" of decimal number is : "+ans);
	}
	
	public static int dec(int n)
	{
		int b=n;
		int i=1;
		int ans=0;
		
		while(b!=0)
		{
			ans=ans+b%10*i;
			
			b=b/10;
			i=i*8;
		}
		return ans;
	}
}
