package testForLecture2;
import java.util.Scanner;
import java.io.*;
public class ReverseNumber 
{
	public static void main(String args[])
	{
		int num,fd,secd,thd,fod,fid,rn;
		
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		
		System.out.print("Enter Five Numbers : ");
		num=sc.nextInt();
		fd=num/10000;
		secd=num%10000/1000;
		thd=num%1000/100;
		fod=num%100/10;
		fid=num%10;
		rn=fid*10000+fod*1000+thd*100+secd*10+fd;
		System.out.print("Reverse Number : "+rn);
	
	}
}
