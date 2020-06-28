package com.examples.encapsulation;

public class DemoOne {

	public static void main(String[] args) {
		Car ob = new Car();
		ob.setColor("black");
		ob.setMake("Honda");
		ob.setModel("Zgdf2");
		ob.setYear(1998);

		System.out.println(ob.getColor() + " - " + ob.getMake() + " - "
				+ ob.getModel() + " - " + ob.getYear());

		// System.out.println(ob);

		Car cons = new Car("Blue", "Maruti", "Alto", 1996);

		System.out.println(cons);

		Car ob2 = new Car();
		ob2.setColor("Blue");
		ob2.setMake("Maruti");
		ob2.setModel("DFFGRT");
		ob2.setYear(2000);

		System.out.println(ob2.getColor() + " - " + ob2.getMake() + " - "
				+ ob2.getModel() + " - " + ob2.getYear());

		// System.out.println(ob2);

		Car cons1 = new Car("White", "Bhaarti", "Tensai", 1994);

		System.out.println(cons1);
	}

}
