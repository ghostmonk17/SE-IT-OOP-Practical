/* Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters
two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2
are not integers, the program would throw a Number Format Exception. If Num2 were zero, the
program would throw an Arithmetic Exception. Display the exception. */

package project;
import java.util.*;
public class lab6 {
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		int num1, num2;
		int sol; 
		try {
			System.out.println("enter first number");
			num1=sc.nextInt();
			System.out.println("enter second number");
			num2=sc.nextInt();
			sol=num1/num2;
			System.out.println("answer of division : " + sol);
			
		}
		
		catch(NumberFormatException n) {
			System.out.println("enter integers");
			
		}  
		catch(ArithmeticException a)
		{
			System.out.println("dont divuide by zero");
		}
		catch ( ArrayIndexOutOfBoundsException w) {
			System.out.println (" array index is out of bound ");
		}
	}
}



