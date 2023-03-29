package anotherLooping;
import java.util.*;
public class SwapFandL 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int ans;
		int m;
		
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		int ld=n%10;
		int fd=0;
		int i=10;
		do 
		{
			fd=n/i;
			m=n%i-ld;
			ans=ld*i+m+fd;
			
			i=i*10;	
			
		}while(fd>10);
		
		System.out.println("The result of swaping first digit and last digit is : "+ans);
	}
}
