package testForLecture1;

public class ReversesDigit2 
{
	public static void main(String a[])
	{
		int n=23456;
		
		int fd=n/10000;
		int sd=n%10000/1000;
		int thd=n%1000/100;
		int fod=n%100/10;
		int fid=n%10;
		int rn=fid*10000+fod*1000+thd*100+sd*10+fd;
		
		System.out.println("Original Number : "+n);
		System.out.println("Reverse Number : "+(fid*10000+fod*1000+thd*100+sd*10+fd));
		System.out.println("Reverse Number : "+rn);
	}
}
