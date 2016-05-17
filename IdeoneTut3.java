/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */

/* TUTORIAL 3
   -- import Scanner. Demonstrate program input.
*/
class IdeoneTut3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println("Hello, world!");
		
		// instantiate the class
		s_OtherClass otherClassInst = new s_OtherClass(12, 5);
		
		double absValue = otherClassInst.f_returnAbsoluteValue();
		
		System.out.println("ABSOLUTE VALUE = " + absValue);
		
		// Scanner
		Scanner v_scan1 = new Scanner(System.in);
		System.out.println(v_scan1.nextLine());
		
		
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
