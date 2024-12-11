/* */

import java.util.Scanner;

abstract class shape{
	Scanner sc=new Scanner(System.in);
	double a;
	double b;
	abstract void input();
	abstract void compute_area ();
		
	
}

class triangle extends shape{
	Scanner sc=new Scanner(System.in);
	
	void input() {
		System.out.print("Enter Base of Triangle:");
		a=sc.nextDouble();
		System.out.print("Enter Height of Triangle:");
		b=sc.nextDouble();
		}
	void display() {
		double area=(0.5*a*b);
		System.out.print("The area of Triangle is: "+area);
		
	}
	
	
	
}

class rectangle extends shape{
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.print("Enter length of rectangle:");
		a=sc.nextDouble();
		System.out.print("Enter Breadth of rectangle:");
		b=sc.nextDouble();	
		}
	void display() {
		double Area=(a*b);
		System.out.print("The area of Rectangle : "+Ares);
	}
	
}

public class Practical_4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.To find Area of Triangle");
		System.out.println("2.To find Area of Rectangle");
		System.out.println("\n"+"Enter Operation You Want to perform: ");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			shape t=new triangle();
			t.input();
			t.display();
			break;
			
		case 2:
			shape r=new rectangle();
			r.input();
			r.display();
			break;
			
		default:
			System.out.println("Invalid Input");
			
		}
		
	}
}
