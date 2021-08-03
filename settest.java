package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class settest {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(1);
		h.add(2);
		h.add("nari");
		h.add("sam");
		h.add(2);
		h.add(8);
		h.add("radha");
		h.add(null);
		h.add(null);
		System.out.println("hash set running iterating");
		//System.out.println(h);
		Iterator i1=h.iterator();
		while(i1.hasNext())
		{
			Object k=i1.next();
			System.out.print(k+ "   ");
		}
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("sai");
		lh.add("madhu");
		lh.add("praveen");
		lh.add(2);
		lh.add(3);
		lh.add("nari");
		lh.add("sam");
		lh.add(null);
		lh.add(null);
		System.out.println("linked list running");
		System.out.println(lh);
		LinkedHashSet lh1=new LinkedHashSet();
		lh1.add(2);
		lh1.add(3);
		lh1.add(100);
		TreeSet tr=new TreeSet();
		tr.add(22);
		tr.add(78);
		tr.add(9);
		tr.add(1);
		tr.add(45);
		tr.add(23);
		tr.add(56);

		System.out.println("treeset working");
		System.out.println("iterator working");
		Iterator k=tr.iterator();
		while(k.hasNext())
		{
			Object k1=k.next();
			System.out.print(k1+" ");
		}
		
		
		
		
	}

}
