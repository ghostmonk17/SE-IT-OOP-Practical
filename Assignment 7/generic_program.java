/*
Implement a generic program using any collection class to count the number of elements in a
collection that have a specific property such as even numbers, odd number, prime number and
palindromes. 
 */
package oop;

import java.util.*;

public class assignment7 {
	
  public static void main(String []args) {
	List <Integer> list=new ArrayList<>();
	System.out.println(list);
	Scanner sc=new Scanner(System.in);
	System.out.print("How many Elements:");
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++) {
		System.out.print("Enter number:");
		int a=sc.nextInt();
		list.add(a);
	}
	System.out.println(list);
	int c_even =0;
	for(int num: list) {
		if(num%2==0) {
			c_even++;
		}
	}
	System.out.println("Even:"+c_even);
	
	int c_odd=0;
	for(int num:list) {
		if(num%2!=0) {
			c_odd++;
		}
	}
	System.out.println("Odd:"+c_odd);
	
	int c_prime=0;
	for(int num:list) {
		if(num==2) {
//			c_prime++;
		}
		else{
			for(int i=2;i<=Math.sqrt(num);i++) {
				
				if(num%i==0) 
				{
          c_prime++;
				}
			}
		}
	}
	System.out.println("Prime:"+c_prime);
	
	int c_pal=0;
	for(int num:list) {
		int temp=num;
		while(temp>0) {
			temp=temp%10;
		}
		if(temp==num) {
			c_pal++;
		}
	}
	}
	
}
