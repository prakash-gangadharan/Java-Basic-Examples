package com.examples.threads;

import java.util.Enumeration;
import java.util.Hashtable;

class Call {

	Hashtable<String, String> hm = new Hashtable<String, String>();

	Call() {
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		hm.put("fourth", "THIRD INSERTED");
		hm.put("fifth", "THIRD INSERTED");
	}

	public void meth() {

		Enumeration<String> em = hm.keys();

		while (em.hasMoreElements()) {
			String key = em.nextElement();
			System.out.println(" Key: " + key + " Value : " + hm.get(key));

		}
	}
}

class Thread1 implements Runnable {
	Call ob;
	Thread t;

	Thread1(Call ob) {
		this.ob = ob;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		// ob.meth();
		ob.meth();
	}
}

class SynchronizedDemo1 {
	public static void main(String args[]) {
		Call a = new Call();
		Thread1 t1 = new Thread1(a);
		Thread1 t2 = new Thread1(a);
		Thread1 t3 = new Thread1(a);
		
/*		try {
			t1.t.join();
			t2.t.join();
			t3.t.join();
		} catch (InterruptedException e) {
		}*/

	}
}