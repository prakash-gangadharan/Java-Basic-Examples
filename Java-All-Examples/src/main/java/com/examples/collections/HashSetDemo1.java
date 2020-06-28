package com.examples.collections;
import java.util.*;



public class HashSetDemo1 {

	public static void main(String[] args) {
				
//		long startTime = System.currentTimeMillis();
		long startTime = System.nanoTime();
		/*List oi=new ArrayList();
		for(int i=0;i<200000;i++){
			oi.add(i);
		}
		oi.remove(568);*/
		
		
		List lis= new ArrayList();
		lis.add("mini");
		lis.add(567);
		lis.add('r');
		
		Set oi=new HashSet();
		//Set oi=new LinkedHashSet();
		//Set oi=new TreeSet();
		//oi.add(null);
		//oi.add(34);
		//oi.add("venki");
		oi.addAll(lis);
		System.out.println(oi);
		
		long endTime   = System.nanoTime();

		System.out.println(endTime - startTime);

	}

}
