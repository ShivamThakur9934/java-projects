import java.lang.*;
class Rectangle
{
	public static void main(String args[])
	{
		float l = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float a = l*b;
		float p = 2*(l+b);
		System.out.println("Area of rectangle ="+ a);
		System.out.println("Perimeter of rectangle ="+ p);
	}
}