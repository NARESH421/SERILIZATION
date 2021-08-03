package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Teststd {
	public static void main(String[] args) {
		HashSet<Student> h=new HashSet();
		
		Student s1=new Student();
		s1.setAge(12);
		s1.setMarks(456);
		s1.setSid(1);
		s1.setSname("naresh");
		
		Student s2=new Student();
		s2.setAge(14);
		s2.setMarks(457);
		s2.setSid(2);
		s2.setSname("drithi");
		
		Student s3=new Student();
		s3.setAge(23);
		s3.setMarks(458);
		s3.setSid(3);
		s3.setSname("apple");
		
		Student s4=new Student();
		s4.setAge(53);
		s4.setMarks(458);
		s4.setSid(3);
		s4.setSname("elephant");
		
		System.out.println("hash code s1"+s1);
		System.out.println("hash code s2"+s2);
		System.out.println("hash code s3"+s3);
		System.out.println("hash code s4"+s4);
		h.add(s1);
		h.add(s2);
		h.add(s3);
		
		for(Student t: h)
		{
			System.out.println("hash code is"+t+"   "+t.toString());
			System.out.println(t.getAge()+"   "+t.getMarks()+"   "+t.getSname()+"   "+t.getSid());
		}
		/*
		 * Iterator k=h.iterator(); while(k.hasNext()) { Student i=(Student) k.next();
		 * System.out.println(i); }
		 */}
	
	
		
		
	}

