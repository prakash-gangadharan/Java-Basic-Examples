package com.examples.practise;

class Hidden {
	private String firstName = "Missing First Name";
	private String lastName = "Missing Last Name";

	public Hidden() {
	}

	public Hidden(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

public class Encasulation {
	public static void main(String args[]) {
		Hidden ob = new Hidden("Prakash", "Gangadharan");
		System.out.print(ob.getFirstName());
		System.out.print(" ");
		System.out.println(ob.getLastName());
	}
}