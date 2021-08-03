package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableTest {
	public static void main(String[] args) {
		Hashtable<String,Integer> ht=new Hashtable();
		ht.put("abc", 1);
		ht.put("xyz", 2);
		ht.put("xy", 1);

		//ht.put(null, 3);
		System.out.println(ht);
		
		Student s1=new Student(1, "abc", 234, 12);
		Student s2=new Student(2, "xyz", 235, 13);
		Student s3=new Student(3, "pqr", 236, 14);
		Student s4=new Student(4, "mno", 237, 15);
		Hashtable<Student,Integer> h=new Hashtable();
		h.put(s1, 1);
		h.put(s2, 2);
		h.put(s3, 3);
		h.put(s4, 4);
		h.put(s4, 4);
		//h.put(s3, null);
		System.out.println(h);
		Enumeration<Student> k=h.keys();
		while(k.hasMoreElements())
		{
			Student s=k.nextElement();
			System.out.println(s);
		}
		Set<Entry<String,Integer>> z2=((Hashtable<String,Integer>) k).entrySet();
		Iterator<Entry<String, Integer>> n=z2.iterator();
		while(n.hasNext())
		{
			Entry<String, Integer> z1=n.next();
			System.out.println(z1.getKey()+"           "+z1.getValue());
		}
		
		//it is legacy class it is not accept null at key and value , not accept duplicate if its add override
	}

}
