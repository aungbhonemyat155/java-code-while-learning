package selectionTest;
import java.util.*;
public class BMI 
{
	public static void main(String args[])
	{
		float w,h,bmi,wk,hm;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your weight in pound : ");
		w=sc.nextFloat();
		System.out.print("Enter your height in inch : ");
		h=sc.nextFloat();
		
		wk=(float) (w*0.454);
		hm=(float) (h*0.0254);
		bmi=wk/(hm*hm);
		
		System.out.println("Your bodyweight in kg : "+wk);
		System.out.println("Your Height in meter : "+hm);
		System.out.println("Your BMI is : "+bmi);
		
		if(bmi<18.5)
		{
			System.out.print("You are Underweight!");
		}
		else if(bmi<25.0 )
		{
			System.out.print("Your are Normal!");
		}
		else if(bmi<30 )
		{
			System.out.print("Your are Overweight!");
		}
		else
		{
			System.out.print("You are Obese!");
		}
	}
}
