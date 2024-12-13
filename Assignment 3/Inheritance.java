/* Design and develop inheritance for a given case study, identify objects and relationships and
implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address, Mail_id,
and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project
Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the
inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff
club fund. Generate pay slips for the employees with their gross and net salary.*/

package practice;
import java.util.*;

abstract class Employee{
	String name,Address,Mail_id;
	long Mobile_no,id;
        abstract void accept();
	abstract void payslip();
	abstract void display();
	Scanner sc = new Scanner(System.in);
}
class Programmer extends Employee{
	double DA=97,HRA=10,pf=12,scf=0.1,BP,gross,net;
	void accept(){
		System.out.print("enter programmer name :");
		name =sc.nextLine();
		System.out.print("enter programmer id :");
		id =sc.nextLong();
		System.out.print("enter programmer Address :");
		Address =sc.nextLine();
		System.out.print("enter programmer Mail_id:");
		Mail_id =sc.nextLine();
		System.out.print("enter programmer Mobile_no :");
		Mobile_no =sc.nextLong();
		System.out.print("enter programmer Basic Pay :");
		BP =sc.nextDouble();
	}
	void payslip(){
		gross=BP+(BP*(DA+HRA)/100);
		net=gross-(BP*(pf+scf)/100);
	}
	void display(){
		System.out.println("enter programmer name :"+name);
		System.out.println("enter programmer id :"+id);
		System.out.println("enter programmer Address :"+Address);
		System.out.println("enter programmer Mail_id:"+Mail_id);
		System.out.println("enter programmer Mobile_no :"+Mobile_no);
		System.out.println("enter programmer Basic Pay :"+BP);
		System.out.println("enter programmer gross salary :"+gross);
		System.out.println("enter programmer net salary:"+net);
}
}
class Assistant_Professor  extends Employee{
	double DA=97,HRA=10,pf=12,scf=0.1,BP,gross,net;
	void accept(){
		System.out.print("enter Assistant_Professor name :");
		name =sc.nextLine();
		System.out.print("enter Assistant_Professor id :");
		id =sc.nextLong();
		System.out.print("enter Assistant_Professor Address :");
		Address =sc.nextLine();
		System.out.print("enter Assistant_Professor Mail_id:");
		Mail_id =sc.nextLine();
		System.out.print("enter Assistant_Professor Mobile_no :");
		Mobile_no =sc.nextLong();
		System.out.print("enter Assistant_Professor Basic Pay :");
		BP =sc.nextDouble();
	}
	void payslip(){
		gross=BP+(BP*(DA+HRA)/100);
		net=gross-(BP*(pf+scf)/100);
	}
	void display(){
		System.out.println("enter Assistant_Professor name :"+name);
		System.out.println("enter Assistant_Professor id :"+id);
		System.out.println("enter Assistant_Professor Address :"+Address);
		System.out.println("enter Assistant_Professor Mail_id:"+Mail_id);
		System.out.println("enter Assistant_Professor Mobile_no :"+Mobile_no);
		System.out.println("enter Assistant_Professor Basic Pay :"+BP);
		System.out.println("enter Assistant_Professor gross salary :"+gross);
		System.out.println("enter Assistant_Professor net salary:"+net);
}
}
class Associate_Professor extends Employee{
	double DA=97,HRA=10,pf=12,scf=0.1,BP,gross,net;
	void accept(){
		System.out.print("enter Associate__Professor name :");
		name =sc.nextLine();
		System.out.print("enter Associate_Professor id :");
		id =sc.nextLong();
		System.out.print("enter Associate_Professor Address :");
		Address =sc.nextLine();
		System.out.print("enter Associate_Professor Mail_id:");
		Mail_id =sc.nextLine();
		System.out.print("enter Associate_Professor Mobile_no :");
		Mobile_no =sc.nextLong();
		System.out.print("enter Associate_Professor Basic Pay :");
		BP =sc.nextDouble();
	}
	void payslip(){
		gross=BP+(BP*(DA+HRA)/100);
		net=gross-(BP*(pf+scf)/100);
	}
	void display(){
		System.out.println("enter Associate_Professor name :"+name);
		System.out.println("enter Associate_Professor id :"+id);
		System.out.println("enter Associate_Professor Address :"+Address);
		System.out.println("enter Associate_Professor Mail_id:"+Mail_id);
		System.out.println("enter Associate_Professor Mobile_no :"+Mobile_no);
		System.out.println("enter Associate_Professor Basic Pay :"+BP);
		System.out.println("enter Associate_Professor gross salary :"+gross);
		System.out.println("enter Associate_Professor net salary:"+net);
	}	
}		
class Professor extends Employee{
	double DA=97,HRA=10,pf=12,scf=0.1,BP,gross,net;
	void accept(){
		System.out.print("enter Professor name :");
		name =sc.nextLine();
		System.out.print("enter Professor id :");
		id =sc.nextLong();
		System.out.print("enter Professor Address :");
		Address =sc.nextLine();
		System.out.print("enter Professor Mail_id:");
		Mail_id =sc.nextLine();
		System.out.print("enter Professor Mobile_no :");
		Mobile_no =sc.nextLong();
		System.out.print("enter Professor Basic Pay :");
		BP =sc.nextDouble();
	}
	void payslip(){
		gross=BP+(BP*(DA+HRA)/100);
		net=gross-(BP*(pf+scf)/100);
	}
	void display(){
		System.out.println("enter Professor name :"+name);
		System.out.println("enter Professor id :"+id);
		System.out.println("enter Professor Address :"+Address);
		System.out.println("enter Professor Mail_id:"+Mail_id);
		System.out.println("enter Professor Mobile_no :"+Mobile_no);
		System.out.println("enter Professor Basic Pay :"+BP);
		System.out.println("enter Professor gross salary :"+gross);
		System.out.println("enter Professor net salary:"+net);
	}	
}
public class Main1{
	public static void main(String args[]){
		Programmer p = new Programmer();
		p.accept();
		p.payslip();
		p.display();
		System.out.println("..................................");		
		Assistant_Professor ap = new Assistant_Professor();
		ap.accept();
		ap.payslip();
		ap.display();
		System.out.println("..................................");
		Associate_Professor ac = new Associate_Professor();
		ac.accept();
		ac.payslip();
		ac.display();
		System.out.println("..................................");
		Professor ps = new Professor();
		ps.accept();
		ps.payslip();
		ps.display();
		System.out.println("..................................");
	}
}
