/* Lab Assignment 8
Implement a program for maintaining a database of student records using Files.
Student has Student_id,name, Roll_no, Class, marks and address. Display the data for few
students.
1. Create Database
2. Display Database
3. Delete Records
4. Update Record
5. Search Record
*/

package Buffer;
import java.io.*;
import java.util.Scanner;

class StudentRecord {
	   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   public void addRecords() throws IOException {
		   PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt",true)));
		          String name;
		          int roll_no;
		          String s;
		          boolean addmore = false;
		          do
		          {
		        	  System.out.println("Enter Roll no.:");
		        	  roll_no = Integer.parseInt(br.readLine());
		        	  System.out.println("Enter name:");
		        	  name = br.readLine();
		        	  pw.println(roll_no);
		        	  pw.println(name);
		        	  System.out.print("\nRecords added successfully!\n\nDo you want to add more records?(y/n):");
		        	  s = br.readLine();
		        	  if(s.equalsIgnoreCase("y")) 
		        	  {
		        		  addmore = true;
		        		  System.out.println();
		        	      }
		        	  else
		        	  addmore = false;
		          }
		          while(addmore);
		          pw.close();
		          shoeMenu();
	             }
	       
	   public void readRecords() throws IOException{
		   try {
			   BufferedReader file = new BufferedReader(new FileReader("studentRecords.txt"));
			       String name;
			       String rollno;
			       int i=1;
			       while((rollno = file.readLine()) != null) {
			    	   System.out.println("---------------");
			    	   System.out.println("Roll no.:"+rollno);
			    	   System.out.println("Name :"+file.readLine());
			    	   System.out.println();
			           }
			           file.close();
			           shoeMenu();
		      }   
		   catch(FilNotFoundException e) {
			   System.out.println("\nERROR : File not Found!!!");
			   
		           }
	          } 
	   public void clear() throws IOException{
		   PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt")));
		   pw.close();
		   System.out.println("\nAll Records cleared successfully !");
		           for(int i=0; i<999999999;i++);
		           shoeMenu();
	        }
	    public void shoeMenu() throws IOException{
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("1 : Add Records\n2: Display\n3 : Update a Record\n4 : Exit\n\nyour Choise :");
	    	int choise = Integer.parseInt(br.readLine());
	    	   switch(choise) {
	    	   case 1:
	    		      addRecords();
	    	   break;
	    	   case 2:
	    	          readRecords();
	    	   break;
	    	   case 3:
	    		   System.out.println("Enetr Your Choise \n1. Update Roll Number\n2. Update Name");
	    		   int c=sc.nextInt();
	    		   switch(c) {
	    		   case 1:
	    			   System.out.println("Enter Roll no. to be updated:");
	    			   String toUpdateR=sc.next();
	    			   System.out.println("Enter Updated Roll no.");
	    			   String UpdatedR=sc.next();
	    			   updateRecord(toUpdateR,UpdatedR);
	    			   break;
	    		   case 2:
	    			   System.out.println("Enter Nameto be updated:");
	    			   String toUpdateN=sc.next();
	    			   System.out.println("Enter Updated Name:");
	    			   String UpdatedN=sc.next();
	    			   updateRecord(toUpdateN,UpdatedN);
	    			   break;
	    				   default:
	    		           }
	    		   case 4:
	    			    System.exit(1);
	    			    break;
	    			    default:
	    			    	System.out.println("\nInvalid Choise !");
	    	                  }
	                   }
	               private void updateRecord(String a, String b) {
	            	   Scanner s=null;
	            	   String oldFileName="studentRecords.txt";
	            	   String tempName="temp.txt";
	            	   File oldFile=new File(oldFileName);
	            	   File newFile=new File(tempName);
	            	   try {
	            		   FileWriter fw=new FileWriter(tempName,false);
	            		   BufferedWriter bw=new BufferedWriter(fw);
	            		   PrintWriter pw=new PrintWriter(bw);
	            		   s=new Scanner(new File(oldFileName));
	            		   while(s.hasNext()) {
	            			   String data=s.next();
	            			   if(data.equals(a)) {
	            				   pw.println(b);
	            			       }
	            			   else {
	            				   pw.println(data);
	            			       }
	            		     }
	            				 
	            		   s.close();
	            		   pw.flush();
	            		   pw.close();
	            		   oldFile.delete();
	            		   File rename=new File(oldFileName);
	            		   newFile.renameTo(rename);
	            		   System.out.println("\t*********RECORD UPDATED***********\n\n");
	            		   shoeMenu();
	            	   }
	            	   catch(Exception e) {
	            		   System.out.println("Error!!");
	            		   
	            	   }
	               }
	              
	          public static void main(String[] args) throws IOException {
		                  StudentRecord call = new StudentRecord();
		                  call.shoeMenu();
		                  

		                  
	}

}package Buffer;
import java.io.*;

class StudentRecord {
	   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   public void addRecords() throws IOException {
		   PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt",true)));
		          String name;
		          int roll_no;
		          String s;
		          boolean addmore = false;
		          do
		          {
		        	  System.out.println("Enter Roll no.:");
		        	  roll_no = Integer.parseInt(br.readLine());
		        	  System.out.println("Enter name:");
		        	  name = br.readLine();
		        	  pw.println(roll_no);
		        	  pw.println(name);
		        	  System.out.print("\nRecords added successfully!\n\nDo you want to add more records?(y/n):");
		        	  s = br.readLine();
		        	  if(s.equalsIgnoreCase("y")) 
		        	  {
		        		  addmore = true;
		        		  System.out.println();
		        	      }
		        	  else
		        	  addmore = false;
		          }
		          while(addmore);
		          pw.close();
		          shoeMenu();
	             }
	       
	   public void readRecords() throws IOException{
		   try {
			   BufferedReader file = new BufferedReader(new FileReader("studentRecords.txt"));
			       String name;
			       String rollno;
			       int i=1;
			       while((rollno = file.readLine()) != null) {
			    	   System.out.println("---------------");
			    	   System.out.println("Roll no.:"+rollno);
			    	   System.out.println("Name :"+file.readLine());
			    	   System.out.println();
			           }
			           file.close();
			           shoeMenu();
		      }   
		   catch(FilNotFoundException e) {
			   System.out.println("\nERROR : File not Found!!!");
			   
		           }
	          } 
	   public void clear() throws IOException{
		   PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt")));
		   pw.close();
		   System.out.println("\nAll Records cleared successfully !");
		           for(int i=0; i<999999999;i++);
		           shoeMenu();
	        }
	    public void shoeMenu() throws IOException{
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("1 : Add Records\n2: Display\n3 : Update a Record\n4 : Exit\n\nyour Choise :");
	    	int choise = Integer.parseInt(br.readLine());
	    	   switch(choise) {
	    	   case 1:
	    		      addRecords();
	    	   break;
	    	   case 2:
	    	          readRecords();
	    	   break;
	    	   case 3:
	    		   System.out.println("Enetr Your Choise \n1. Update Roll Number\n2. Update Name");
	    		   int c=sc.nextInt();
	    		   switch(c) {
	    		   case 1:
	    			   System.out.println("Enter Roll no. to be updated:");
	    			   String toUpdateR=sc.next();
	    			   System.out.println("Enter Updated Roll no.");
	    			   String UpdatedR=sc.next();
	    			   updateRecord(toUpdateR,UpdatedR);
	    			   break;
	    		   case 2:
	    			   System.out.println("Enter Nameto be updated:");
	    			   String toUpdateN=sc.next();
	    			   System.out.println("Enter Updated Name:");
	    			   String UpdatedN=sc.next();
	    			   updateRecord(toUpdateN,UpdatedN);
	    			   break;
	    				   default:
	    		           }
	    		   case 4:
	    			    System.exit(1);
	    			    break;
	    			    default:
	    			    	System.out.println("\nInvalid Choise !");
	    	                  }
	                   }
	               private void updateRecord(String a, String b) {
	            	   Scanner s=null;
	            	   String oldFileName="studentRecords.txt";
	            	   String tempName="temp.txt";
	            	   File oldFile=new File(oldFileName);
	            	   File newFile=new File(tempName);
	            	   try {
	            		   FileWriter fw=new FileWriter(tempName,false);
	            		   BufferedWriter bw=new BufferedWriter(fw);
	            		   PrintWriter pw=new PrintWriter(bw);
	            		   s=new Scanner(new File(oldFileName));
	            		   while(s.hasNext()) {
	            			   String data=s.next();
	            			   if(data.equals(a)) {
	            				   pw.println(b);
	            			       }
	            			   else {
	            				   pw.println(data);
	            			       }
	            		     }
	            				 
	            		   s.close();
	            		   pw.flush();
	            		   pw.close();
	            		   oldFile.delete();
	            		   File rename=new File(oldFileName);
	            		   newFile.renameTo(rename);
	            		   System.out.println("\t*********RECORD UPDATED***********\n\n");
	            		   shoeMenu();
	            	   }
	            	   catch(Exception e) {
	            		   System.out.println("Error!!");
	            		   
	            	   }
	               }
	              
	          public static void main(String[] args) throws IOException {
		                  StudentRecord call = new StudentRecord();
		                  call.shoeMenu();
		                  

		                  
	}

}




