package selectionTest;
import java.util.*;
public class Calendar 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int y,m;
		System.out.print("Enter The Month And Year*space between them* : ");
		m=sc.nextInt();
		y=sc.nextInt();
		
		if(m==2 && y%4==0 && y%100!=0 || y%400==0 )
		{
			System.out.print(m+"/"+y+" had 29 days.");
		}
		else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
		{
			System.out.print(m+"/"+y+" had 31 days. ");
		}
		else if( m==4 || m==6 || m==9 || m==11)
		{
			System.out.print(m+"/"+y+" had 30 days. ");
		}
		else if(m>12) 
		{
			System.out.print("Error!!");
		}
		else
		{
			System.out.print(m+"/"+y+" had 28 days. ");
		}
	}
}
