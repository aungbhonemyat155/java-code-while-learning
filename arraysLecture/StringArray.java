package arraysLecture;
import java.util.*;
public class StringArray 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		String s=input();
		int word=wordCount(s);
		System.out.print("Word count : "+word+"\n");
		cha(s);
	}
	
	public static String input()
	{
		String input;
		System.out.print("Enter a String : ");
		input=sc.nextLine();
		
		return input;
	}
	
	public static int wordCount(String a)
	{
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c==' '|| c=='.')
			{
				count++;
			}
		}
		return count+1;
	}
	
	public static void cha(String a)
	{
		int count[]=new int[26];
		for(int i=0;i<count.length;i++)
		{
			count[i]=0;
		}
		
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c>96 && c<123)
			{
				count[c-'a']++;
			}
			else if(c>64 && c<91)
			{
				count[c-'A']++;
			}
		}
		
		for(int i=0;i<count.length;i++)
		{
			
			if(count[i]>0)
			{
				char a1=(char) (97+i);
				System.out.println("count of "+a1+" : "+count[i]);
			}
		}
	}
}
