package org.tnsif.capgemini.c2tc.Final;

class cal
{
	public  void show()
	{
		System.out.println("AI integration done by leela");
		
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}
class advcalc extends cal
{
	public void show()
	{
		System.out.println("AI integration done by kanchana");
		
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		advcalc obj=new advcalc();
		obj.show();
		obj.add(4, 5);

	}

}
