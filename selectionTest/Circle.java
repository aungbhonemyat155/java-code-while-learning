package selectionTest;
import java.util.*;
public class Circle 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float x1,y1,r1,x2,y2,r2;
		System.out.println("Enter circle1's center x,y coordinates and radius : ");
		x1=sc.nextFloat();
		y1=sc.nextFloat();
		r1=sc.nextFloat();
		
		System.out.println("Enter circle2's center x,y coordinates and radius : ");
		x2=sc.nextFloat();
		y2=sc.nextFloat();
		r2=sc.nextFloat();
		
		if(x1+r1 > x2+r2 && x1-r1 < x2-r2)
		{
			if(y1+r1 > y2+r2 && y1-r1 < y2-r2)
			{
				System.out.println("second circle is inside of the first circle");
			}
			else if(y1+r1 > y2+r2 && y1-r1 > y2-r2 || y1+r1 < y2+r2 && y1-r1 < y2-r2)
			{
				System.out.println("Two circles are overlaps");
			}
			else 
			{
				System.out.println("Two circle are far away");
			}
		}
		else if(x2+r2 > x1+r1 && x2-r2 < x1-r1)
		{
			if(y2+r2 > y1+r1 && y2-r2 < y1-r1)
			{
				System.out.println("first circle is inside of the second circle");
			}
			else 
			{
				System.out.println("Two circle are far away");
			}
		}
		else 
		{
			System.out.println("Two circle are far away");
		}
	}
}
