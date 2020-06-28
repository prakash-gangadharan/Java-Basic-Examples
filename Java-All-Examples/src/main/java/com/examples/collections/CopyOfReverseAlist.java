package com.examples.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
 
public class CopyOfReverseAlist {
 
  public static void main(String[] args) {
   
    /*List arrayList = new ArrayList();
   
    arrayList.add("1");
    arrayList.add("2");
    arrayList.add("3");
    arrayList.add("4");
    arrayList.add("5");
   
    ListIterator itr = arrayList.listIterator();
   
   
    while(itr.hasNext())
      System.out.print(itr.next()+" ");
    
    
    System.out.println(" ");
   
    while(itr.hasPrevious()) 
      System.out.print(itr.previous()+" ");*/
   
	                  List<String> ll=new LinkedList<String>();
	                  ll.add("venkatesh");
	                  ll.add("prakash");
	                  ll.add("Karthick");
	                  ll.add("Appedo");
	                  ll.add("Bharath");
	                  ListIterator ite=ll.listIterator();
	                  while(ite.hasPrevious())
	                  System.out.println(ite.previous());

	          }
}
 