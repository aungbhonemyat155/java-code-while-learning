package testForLecture2;
import java.util.*;
import java.io.*;
public class ComputingTemp 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		float tc,tf;
		System.out.print("What is your temprature in Fahrenheit : ");
		tf=sc.nextFloat();
		tc=(tf-32)*5/9;
		System.out.print("This is your temprature in Celsius : "+tc);
	}
}
