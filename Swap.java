import java.lang.*;
public  class Swap
{
public static void main(String[] args)
	{
	int a = 5;
	int b = 10;
	System.out.println("before swapping : a= "+ a +", b = " +b);
	int swap = a;
	a = b;
	b = swap;
	System.out.println("after swapping : a= " + a +", b =" + b);
	}
}