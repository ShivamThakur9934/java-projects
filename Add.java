import java.lang.*;
class Add
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int s = a+b;
		int st = a-b;
		int m = a*b;
		System.out.println("sum ="+s);
		System.out.println("sub ="+st);
		System.out.println("multi ="+m);
	}
}