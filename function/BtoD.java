package function;
import java.util.*;
public class BtoD
{
	
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a binary number : ");
		n=sc.nextInt();
		
		int ans=dec(n);
		
		System.out.println(n+" of decimal number is : "+ans);
	}	
	
public static int dec(int n)
{
	int ans=0;
	int i=1;
	int b=n;
	while(b!=0)
	{
		ans=ans+b%10*i;
		
		b=b/10;
		i=i*2;
	}
	return ans;
}	
}
