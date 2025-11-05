import java.lang.*;
public class Aboutme
{
	public static void main(String[] args)
	{
	if (args.length < 3) 
	{
	System.out.println("Enter your  :- name , age , college name ,hobbies .");
	return;
	}
	String name = args[0];
	int age = Integer.parseInt(args[1]);
	String college_name = args[2];
	String hobbie = args[3];

	System.out.println("\n --My Information--");
	System.out.println("Name :" + name);
	System.out.println("Age : " + age);
	System.out.println("college name : " + college_name);
	System.out.println("Hobbie : " + hobbie);
	}
}