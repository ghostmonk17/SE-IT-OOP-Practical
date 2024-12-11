package lab;
import java.util.*;

/*
 * Using concepts of Object-Oriented programming develop solution for any one application
1) Banking system having following operations :
1. Create an account 
2. Deposit money 
3. Withdraw money 
4. Honor daily withdrawal limit
5. Check the balance 
6. Display Account information.

2) Inventory management system having following operations :
1. List of all products 
2. Display individual product information 
3. Purchase 
4. Shipping
5. Balance stock
6. Loss and Profit calculation
 */

class Bank{
	int Balance=0;
	Scanner sc=new Scanner(System.in);
	Random r=new Random();
	public void cr_acc(){
		System.out.println("Enter Your Credentials:-"+"\n"+"=========================================");
		System.out.print("Enter Name of User:");
		String name=sc.next();
		System.out.print("Enter your mobile number");
		int num=sc.nextInt();
		int acc_num=r.nextInt(1000,9000);
		System.out.println("Your Account Number: "+acc_num);
		System.out.println("You have Successfully Created Account!!!");
		
		
	}
	public void dep_money() {
		System.out.print("Please Enter Amount of Money You Want TO insert:₹");
		int mon=sc.nextInt();
		Balance+=mon;
		
	}
	public void wid_money() {
		System.out.print("Please Enter Amount of Money You Want TO Withdraw:₹");
		int wid=sc.nextInt();
		if(wid>Balance) {
			System.out.println("Insufficient Balance!!");
		}
		else if(wid>25000) {
			System.out.println("Exceeding Daily Withdrawl Limit!!");
		}
		else {
			System.out.println("Successfully Withdrawn ₹"+wid);
			Balance -=wid;
		}
		
		System.out.println("Your Remaining Balance is ₹"+Balance);
		
	}
	public void check_bal() {
		System.out.println("Balance: ₹"+Balance);
	}
	public void display(int acc_num,String name,int num) {
		System.out.println("Account Information:"+"\n"+"===================================================");
		System.out.println("Name:"+name);
		System.out.println("Mobile Number:"+num);
		System.out.println("Account Number:"+acc_num);
		System.out.println("Your Account Balance: ₹"+Balance);
	}
}

public class prac9 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int acc_num = 0;
		String name="ok";
		int num=0;
		Bank B=new Bank();
		System.out.println("Welcome to Java public Bank (JPB)");
		System.out.println("1. Create an account ");
		System.out.println("2. Deposit money ");
		System.out.println("3. Withdraw money ");
		System.out.println("4. Check the balance ");
		System.out.println("5. Display Account information.");
		System.out.println("6. Exit");
		int a=0;
		
		while(a!=6) {
		
		System.out.println("Please Select Operation:");
		a=sc.nextInt();
		switch(a) {
		case 1:
			B.cr_acc();
			break;
		case 2:
			B.dep_money();
			break;
		case 3:
			B.wid_money();
			break;
		case 4:
			B.check_bal();
			break;
		case 5:
			B.display(acc_num, name,num);
			break;
		case 6:
			System.out.println("Thank You");
		default:
			System.out.println("Invalid Input");
			break;
		}
		
		}
		
		
	}
}
