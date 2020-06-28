package com.examples.general;

class Testclass {
	private int value;
	
	public Testclass(){
		
	}

	Testclass(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		//System.out.println(((Testclass) o).getValue()+" - "+this.value);
		if(o == null ){
			return false;
		}
		if (o instanceof Testclass && ((Testclass) o).getValue() == this.value) {
			return true;
		} else {
			return false;
		}
	}
	
    @Override
    public int hashCode() {
        int result = 0;
        result = (int) (value / 11);
        System.out.println(result);
        return result;
    }
    
}

public class EqualsHashCodeImplementation {

	public static void main(String[] args) {

		EqualsHashCodeImplementation implObj = new EqualsHashCodeImplementation();
		
		// implObj.logicalVsReferenceEqality();

		Testclass one = new Testclass(1);
		Testclass two = new Testclass(1);
		
		implObj.isBothObjectsEqual(one, two);

		 
		Testclass three = new Testclass(1);
		Testclass four = new Testclass(2);
		
		implObj.isBothObjectsEqual(three, four);
		
		Testclass five=null;
		
		implObj.isBothObjectsEqual(four, five);

	}

	
	
	public void isBothObjectsEqual(Testclass one, Testclass two) {
		System.out.println(one.equals(two));
	}

	public void logicalVsReferenceEqality(){
		
	    String strA = new String("eBay");
        String strB = new String("eBay");
        String strC = new String("Paypal");
 
        String strD = strA;

        System.out.println("Reference Equality Result: ");
        System.out.println(strA == strB); // false
        System.out.println(strB == strC); // false
        System.out.println(strA == strD); // true
        
        System.out.println("\nLogical Equality Result: "); 
        System.out.println(strA.equals(strB)); // true
        System.out.println(strB.equals(strC)); // false
        System.out.println(strB.equals(strD)); // true
		
	}
}