import java.lang.*;
class TTT

{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[7]);
		int b=Integer.parseInt(args[6]);
		int c=Integer.parseInt(args[10]);
		if(a+b > c && a+c > b && b+c > a)
		{
			System.out.println("Trangle is possble");
		}
		else
		{
			System.out.println("trangle is not possible");
		}
	}
}