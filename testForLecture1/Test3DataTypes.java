package testForLecture1;

public class Test3DataTypes 
{
	public static void main(String a[])
	{
		/*int n=52;
		int n1=052;
		int n2=0x52;*/
		
		int n=52,n1=052,n2=0x52;
		float fnumber=4.5f;
		double dnumber=5.7;
		char c='a';
		boolean ans=true;
		String name=new String("Aung Bhone Myat");
		
		System.out.println("Number = "+n);
		System.out.println("Number = "+n1);
		System.out.println("Number = "+n2);
		System.out.println("Float Number Is "+fnumber);
		System.out.println("Double Number Is "+dnumber);
		System.out.println("Character is "+c);
		System.out.println("Ans is "+ans);
		System.out.println("My Name is "+name);
	}
}
