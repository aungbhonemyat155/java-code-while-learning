package selectionTest;
import java.util.*;
public class Word 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s,ss;
		System.out.print("Enter a word : ");
		s=sc.nextLine();
		System.out.print("Enter another word : ");
		ss=sc.nextLine();
		
		
		if(s.compareTo(ss)==0)
		{
			System.out.print("Great - The Same! ");
		}
		else if(s.compareToIgnoreCase(ss)==0)
		{
			System.out.print("Okay - Almost The Same! ");
		}
		else if(s.length() == ss.length())
		{
			System.out.print("Atleast the same length! ");
		}
		else
		{
			System.out.print("Your Two Words are No matching at all ");
		}
	}
}
