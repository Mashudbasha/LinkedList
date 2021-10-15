package com.day14;
import java.util.*;
public class Linkedlist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>ll=new LinkedList<String>();
		System.out.println("Initial list of element: "+ll);
		ll.add("70");
		
		
		System.out.println("after invoking add(30)to (70):"+ll);
		ll.addFirst("30");
		System.out.println("after invoking addFirst(E e)method:"+ll);
        ll.addFirst("56");
        System.out.println("after invoking addFirst(E e)method:"+ll);
	}

}
