package newlecture;
import java.util.*;
public class SecondHighest 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int student;
		
		System.out.println("Enter number of student : ");
		student=sc.nextInt();
		
		int id,score;
		int highestscore=-1;
		int highestid=0;
		int secid=0;
		int secscore=-1;
		
		for(int i=1;i<=student;i++)
		{
			System.out.println("Enter student's ID and score : ");
			id=sc.nextInt();
			score=sc.nextInt();
			
			
			if(highestscore<score)
			{
				secscore=highestscore;
				secid=highestid;
				highestscore=score;
				highestid=id;
			}
			else if(secscore<score)
			{
				secscore=score;
				secid=id;
			}
		}
		
		
		System.out.println("Highest score student's id : "+highestid);
		
		System.out.println("Second-Highest score student's id : "+secid);
			
	}
}
