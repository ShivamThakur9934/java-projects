import java.lang.*;
class Rectangle
{
	public static void main(String args[])
	{
		Float l;
		Float b;
		l=Float.parseFloat("args[0]");
		b=Float.parseFloat("args[1]");
		Float ar = l*b;
		Float pr = 2(l+b);
		Float di = Math.sqrt((l*l)+(b*b));
		System.out.println("Area of rect = "+ar);
		System.out.println("perimeter of rect = "+pr);
		System.out.println("diagonal of rect = "+ di);
	}
}