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
	}


