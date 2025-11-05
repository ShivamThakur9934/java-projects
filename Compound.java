import java.lang.*;
class Compound
{
	public static void main(String args[])
	{
		double a,b,c,r1,r2;
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		c = Double.parseDouble(args[2]);
		double d = (b*b)-(4*a*c);
		if (d > 0)
		{
			r1 = (-b + Math.sqrt(d))/(2*a);
			r2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("two diffrent roots are available _root1 ="+ r1 +", root2 ="+ r2 );
		}
			else if ( d == 0)
			{
			r1=r2 = (-b)/(2*a);
			System.out.println("Root are simmier roo1 = root2 = "+ r1);
			}
				else
				{
				System.out.println("Roots are imagenary ");
				}
	}
}