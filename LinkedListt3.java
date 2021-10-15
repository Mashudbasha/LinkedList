package com.day14;
import java.util.*;

public class LinkedListt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll =new LinkedList<String>();
		System.out.println("initial list of element:"+ll);
		ll.add("56");
		
		System.out.println("after invoking add(E e)method:"+ll);
        ll.addFirst("30");
        System.out.println("after invoking addFirst(E e)method:"+ll);
        ll.remove("56");
        System.out.println("After invoking remove(object)method:"+ll);
        ll.addFirst("56");
        ll.addFirst("70");
        System.out.println("after invoking addFirst(E e)method:"+ll);
        ll.remove("56");
        System.out.println("After invoking remove(object)method:"+ll);
        ll.addFirst("56");
        System.out.println("after invoking addFirst(E e)method:"+ll);
        ll.remove("56");
        ll.remove("70");
        ll.remove("30");
        System.out.println("After invoking remove(object)method:"+ll);
        
        LinkedList<String> ll2 =new LinkedList<String>();
        ll2.add("56");
        ll2.add("30");
        ll2.add("70");
        ll.addAll(ll2);
      
        System.out.println("After invoking addALl(Collection<?extends E>c)method:"+ll);
        LinkedList<String> ll3 =new LinkedList<String>();
        ll3.add("40");
        ll3.add("60");
        ll.addAll(1,ll3);
        System.out.println("After invoking addAll(int index,Collection>?extends E>c)method:"+ll);
        
        ll.remove("40");
        ll.remove("60");
        ll.remove("70");
        System.out.println("After invoking remove(object)method:"+ll);
        ll3.add("56");
        ll3.add("30");
        ll3.addAll( ll3);
        System.out.println("After invoking addALl(Collection<?extends E>c)method:"+ll);
	}

}
