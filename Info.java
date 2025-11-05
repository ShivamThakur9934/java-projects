import java.lang.*;
class Info
{
	public static void main(String args[])
	{
	String name = args[0];
	int age = Integer.parseInt(args[1]);
	String college_name = args[2];
	String department_name = args[3];
	String session = args[4];

	System.out.println("---My Information---");
	System.out.println("Name :" + name);
	System.out.println("Age :" + age);
	System.out.println("College name :" + college_name);
	System.out.println("Department name :" + department_name);
	System.out.println("Session :" + session);
	}
}
