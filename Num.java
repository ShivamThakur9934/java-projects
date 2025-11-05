import java.io.*;
class Num
{
	public static void main(String[] args) throws IOException
	{
		int n;
		DataInputSteram din =new DataInputStream(System.in);
		System.out.print("enter a number :");
		n=Integer.parseInt(din.readLine());
		System.out.print("the factor are :\n");
		for(int i=1;i<=n;i++);
		{
			if(n%i==0)
			System.out.print("\n"+i);
		}
	}


}