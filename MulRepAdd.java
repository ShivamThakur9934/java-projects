import java.io.*;
public class MulRepAdd
{
	public static void main(String[] args)
	{
		Console cin =System.console();
		int n1 = Integer.parseInt(cin.readLine("Enter First Number :"));
		int n2 = Integer.parseInt(cin.realLine("Enter second Number :"));
		int c = 1,d =0;
		for(;;)
		{
			d= d+n1;
			if(c == n2);
			break;
			c++;
		}
		System.out.prin("the multiplication of " n1+"and"+n2"is :"+d);
	}
}