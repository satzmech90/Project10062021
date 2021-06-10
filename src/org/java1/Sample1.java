package org.java1;

public class Sample1 {
		private void empDetails() {
			System.out.println("Normal method");
		}
	    private void empDetails(int a) {
			System.out.println("Employee id " + a);
		}
	    private void empDetails(int a,int yoj) {
			System.out.println("Company id " + a);
			System.out.println("Year of Joining "+ yoj);
		}
	    private void empDetails(String name,long mobileNo) {
			System.out.println("Empolyee name " + name);
			System.out.println("Mobile number "+ mobileNo);
		}
	    private void qual(String qual, double per) {
	    	System.out.println("Qualification of Employee is "+qual);
	    	System.out.println("Percentage of Marks Scored is "+per);
		}
	    private void empDetails(int salary, String DOB, String Address) {
	    	System.out.println("Salary of Employee is " +salary);
	    	System.out.println("DOB os Employee is " +DOB);
	    	System.out.println("Address of Employee is " +Address);
		}
	    
	    
	    
	}


