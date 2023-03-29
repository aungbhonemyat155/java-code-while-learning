package newlecture;
import java.util.*;
public class Student 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int student;
		
		System.out.println("Enter the number of students : ");
		student=sc.nextInt();
		
		int highestid=high(student);
		
		System.out.println("Highest Score Student's Id : "+highestid);
	}
	
	public static int high(int n)
	{
		Scanner sc=new Scanner(System.in);
		int id,score;
		int highestscore=-1;
		int highestid=0;
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter student's ID and score : ");
			id=sc.nextInt();
			score=sc.nextInt();
			
			
			if(highestscore<score)
			{
				highestscore=score;
				highestid=id;
			}
		}
		return highestid;
	}
}
