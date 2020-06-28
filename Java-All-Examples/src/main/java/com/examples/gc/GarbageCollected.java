package com.examples.gc;

public class GarbageCollected {

	public static void main(String[] args) {
		GarbageCollected t = new GarbageCollected();
		System.out.println(t);
		t = null;
		//System.gc();
	}

	public void finalize() {
		System.out.println("Garbage Collected");
	}
}