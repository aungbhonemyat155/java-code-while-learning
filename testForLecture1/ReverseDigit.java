package testForLecture1;

public class ReverseDigit 
{
	public static void main(String a[])
	{
		int n=23456;
		int fd=2,sd=3,thd=4,fod=5,fid=6,rn=fid*10000+fod*1000+thd*100+sd*10+fd;
		
		System.out.println("Original Number : "+n);
		System.out.println("Reverse Number : "+(fid*10000+fod*1000+thd*100+sd*10+fd));
		System.out.println("Reverse Number : "+rn);
	}
}
