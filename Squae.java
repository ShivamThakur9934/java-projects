import java.lang.*;
public class Square 
{
public statc void main(String[] args)
	{
	if (args.length < 1)
	{
	System.out.println("Enter a number .");
	return;
	}
	try
	{
	double number = Double.parseDouble(args[0]);
	double square = number * number;
	System.out.println("the square of "+number+ " is " + square);
	}
	catch (NumberFormatException e)
	{
	System.out.println("enter any no .");
	}
	}
}