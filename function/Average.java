package function;
import java.util.*;
public class Average 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,negative=0,positive=0,count=0,total=0;
		double average=0;
		
		
		System.out.println("Enter an integer,the input ends if it is 0 : ");
		
		while((n=sc.nextInt())!=0)
		{
			total=total+n;
			
			count++;
			
			if(n>0)
			{
				positive++;
			}
			else
			{
				negative++;
			}
		}
		average=(double)total/count;
		
		System.out.println("The number of positive is "+positive);
		System.out.println("The number of negative is "+negative);
		System.out.println("The total is "+total);
		System.out.println("The average is "+average);
	}
}
