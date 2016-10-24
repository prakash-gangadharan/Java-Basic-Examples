package com.examples.collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;


public class HeterogeneousDemo {

	public static void main(String[] args) {
		List oi = new LinkedList();
		oi.add(1);
		oi.add("name01");
		oi.add('c');
		System.out.println(oi);
		
		/*ConcurrentSkipListSet oi=new ConcurrentSkipListSet();
		oi.add(1);
		oi.add("name01");
		oi.add('c');
		System.out.println(oi);*/
		
		
		/*TreeSet oi=new TreeSet();
		oi.add(1);
		oi.add("name01");
		oi.add('c');
		System.out.println(oi);*/
	}

}
