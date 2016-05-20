
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class IdeoneTut6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println("Hello, world!");
		
		// instantiate the class
		s_OtherClass otherClassInst = new s_OtherClass(12, 5);
		
		double absValue = otherClassInst.f_returnAbsoluteValue();
		
		System.out.println("ABSOLUTE VALUE = " + absValue);
		
		// TUTORIAL 6 : variables and the increment operator
		Scanner v_scan1 = new Scanner(System.in);
		String yourName = "";
		System.out.println("Please enter your name:");
		yourName = v_scan1.nextLine();
		
		System.out.println("Your name is " + yourName);
		
		// TUTORIAL 6 : increment operator
		int a = 1;
		int b = ++a;
		
		return;
	}
}

class s_OtherClass 
{
	public double real; //nk
	public double imaginary; // ll
	
	public s_OtherClass(double in_real, double in_imaginary)
	{
		real = in_real;
		imaginary = in_imaginary;
		return;
	}
	
	public s_OtherClass()
	{
		real = 0;
		imaginary = 0;
	}
	
	public double f_returnAbsoluteValue()
	{
		double absValSquared = real * real + imaginary * imaginary;
		return java.lang.Math.sqrt(absValSquared);
	}
}
Status API Training Shop Blog About
