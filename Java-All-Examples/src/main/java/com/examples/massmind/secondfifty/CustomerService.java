package com.examples.massmind.secondfifty;

class NameNotFoundException extends Exception {

    public NameNotFoundException(String message) {
        super(message);
    }

}

public class CustomerService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			throw new NameNotFoundException("Name is empty!");
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
