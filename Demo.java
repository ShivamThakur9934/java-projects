import java.io.*;
class Factor
{
	public static void main(String[] args) throw IOException
	{
		int n;
		DataInoutSteram din =new DataInputStream(System.in);
		System.out.print("enter a number :");
		n=Integer.parseInt(din.readLine());
		System.out.print("the factor are :\n");
		for(int i=;i<=n;i++);
		{
			if(n%i==0)
			System.out.print("\n"+i);
		}
	}


}