package looping;
import java.util.*;
public class ReverseNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rn=0;
		System.out.println("Enter A Number : ");
		n=sc.nextInt();
		
		for(int i=n;i!=0;i=i/10) 
		{
			rn=rn*10+i%10;
			
		}
		System.out.println(rn);
	}
}
