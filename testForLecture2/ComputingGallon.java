package testForLecture2;
import java.util.Scanner;
import java.io.*;
public class ComputingGallon 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		float lg,wd,hg,gl;
		System.out.print("Enter width,length,height of your tank in feet : ");
		lg=sc.nextFloat();
		wd=sc.nextFloat();
		hg=sc.nextFloat();
		gl=lg*wd*hg;
		
		System.out.println("Your tank can store "+gl+" Gallons ");
		
	}
}
