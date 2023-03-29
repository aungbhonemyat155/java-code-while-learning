package selectionTest;

import java.util.Scanner;

public class Quadratic 
{
	public static void main(String args[])
	{
		int a,b,c,tamp,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("This is quadratic equation calculator");
		System.out.print("Enter the values of a , b and c : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		tamp=b*b-(4*a*c);
		System.out.println(tamp);
		t=(int) Math.sqrt(tamp);
		
		if(tamp<0)
		{
			System.out.print("No Solution!");
		}
		else if(tamp==0)
		{
			System.out.print("One Solution = "+-b/(2*a));
		}
		else  
		{
			System.out.print("Two Solution = "+ (-b+t)/(2*a) +" and "+ (-b-t)/(2*a));
		}
		
	}
}
