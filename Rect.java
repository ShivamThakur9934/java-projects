 import java.util.Scanner;
class Rect
{
	double l,b;
	Rect()
	{
		l=b=0.0;

	}
	Rect(double x,double y)
	{
		l=x , b=y;
	}
	void Setvalue(souble x,double y)
	{
		l=x , b=y;
	}
	void input()
	{
		Scanner sc = new scanner(system.in);
		System.out.print("enter the value of length :");
		l=sc.nextDouble();
		Sysrem.out.print("ebter the vaue of breath :");
		b=sc.nextDouble();
	}
	void show()
	{
		System.out.println("Length =" + l + "Breadt  " +b);
	}
	void area()
	{
		double ar;
		ar=l*b;
		System.out.println("Area = " + ar);
	}
}
class RectEg
{
	public static void main(String args[])
	{
		Rect r1 = new Rect();
		Rect r2 = new Rect(4.5,3.2);
		r1.disp();
		r1.Setvalue(2.,3.8);
		r1.disp();
		r1.area();
}