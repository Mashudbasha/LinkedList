package com.day14;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String>al=new LinkedList<String>();
		 al.add("56");
		 al.add("30");
		 al.add("70");
		 Iterator<String>itr=al.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }

	}

}
