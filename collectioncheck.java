package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class collectioncheck {
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<>();
		c.add("one");
		c.add("two");
		c.add("three");
		Collection<String> c1=new ArrayList<>();
		c1.add("three");
		c1.add("four");
		c1.add("six");

		c.addAll(c1);
		//c1.addAll(c);
		//c.remove("one");//it is paritcular object
		//c.removeAll(c1);//like c-c1 it means total remove from c1 and which data c1 it removes from c
		//c.retainAll(c1);
		
		//c.retainAll(c1);//interjection of two colletitons
		System.out.println("passinge element one by one");

		ListIterator<String> it=((ArrayList<String>) c).listIterator();
		while(it.hasNext())
		{
			String n=it.next();
			//System.out.println(n);
			
		}
		
		
		
		/*
		 * for(String k: c) { System.out.println(k); }
		 */
		List<String> list=new LinkedList<>();
		list.add("1111");
		list.add("2222");
		list.add("3333");
		list.add("4444");
		List<String> list2=new LinkedList<>();
		list2.add("5555");
		list2.add("6666");
		list2.add("7777");
		list.addAll(list2);
		//list.remove(0);
		list.removeAll(list2);
		System.out.println("linked list elements");
		ListIterator<String> lt=((LinkedList<String>) list).listIterator();
		while(lt.hasNext())
		{
			String k=lt.next();
			System.out.println(k);
		}
		List<String> v=new Vector();
		v.add("aaa");
		v.add("bbb");
		v.add("ccc");
		ListIterator<String> vt=((Vector<String>) v).listIterator();
		System.out.println("vector elements");
		while(vt.hasNext())
		{
			String k=vt.next();
			System.out.println(k);
		}
		
		
	}

}
