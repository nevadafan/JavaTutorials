/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/* TUTORIAL 11 - Using multiple classes
 * In this Tutorial, we are discussing how to use multiple classes in Java */
 
class IdeoneTut2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println("Hello, world!");
		
		// instantiate the class
		s_OtherClass otherClassInst = new s_OtherClass(12, 5);
		
		double absValue = otherClassInst.f_returnAbsoluteValue();
		
		System.out.println("ABSOLUTE VALUE = " + absValue);
		
		int first = 1, second = 1;
		int num_iterations = -1;
		
	  if((num_iterations < 0) || (num_iterations > 100))
	    return;
	  else if(num_iterations == 0)
	  {
	    String str1 = "Nothing to print out. The number of iterations has been specified to be zero";
	    System.out.println(str1);
	  }
	  else 
	  {
	    
	    int swap = first + second;
	    
	    System.out.println("Printing Fibonacci sequence");
	    
	    for(int index = 0; index < num_iterations; index++)
	    {
	       first = second;
	       second = swap;
	       swap = first + second;
	       
	       System.out.println(first);
	    }
	  }
	 
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
