package testForLecture1;

public class BitwiseTest 
{
	public static void main(String args[])
	{
		byte a=1,b=3,c=0;
		c=(byte)(a&b);
		System.out.println(c);
		c=(byte)(a|b);
		System.out.println(c);
		c=(byte)(a^b);
		System.out.println(c);
		c=(byte)(a<<2);
		System.out.println(c);
		c=(byte)(a>>2);
		System.out.println(c);
		c=(byte)~a;
		System.out.println(c);
		
	}
}
