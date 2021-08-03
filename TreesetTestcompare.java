package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class TreesetTestcompare {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setAge(12);
		s1.setMarks(456);
		s1.setSid(1);
		s1.setSname("naresh");
		
		Student s2=new Student();
		s2.setAge(13);
		s2.setMarks(457);
		s2.setSid(2);
		s2.setSname("drithi");
		
		Student s3=new Student();
		s3.setAge(13);
		s3.setMarks(458);
		s3.setSid(3);
		s3.setSname("apple");
		
		Student s4=new Student();
		s4.setAge(18);
		s4.setMarks(459);
		s4.setSid(4);
		s4.setSname("Ant");
		System.out.println("by id");
		
		TreeSet<Student> tr=new TreeSet(new stdbasedonId());
		tr.add(s4);
		tr.add(s1);
		tr.add(s2);
		tr.add(s3);
		//System.out.println(tr);

		for(Student k: tr)
		{
			System.out.println(k.getAge()+"   "+k.getMarks()+"   "+k.getSname()+"   "+k.getSid());
		}
		System.out.println("by name");
		TreeSet<Student> tr1=new TreeSet(new stdbasedonname());
		tr1.add(s4);
		tr1.add(s1);
		tr1.add(s2);
		tr1.add(s3);
		for(Student k: tr1)
		{
			System.out.println(k.getAge()+"   "+k.getMarks()+"   "+k.getSname()+"   "+k.getSid());
		}
		System.out.println("by age");
		TreeSet<Student> tr2=new TreeSet(new stdbasedonage());
		System.out.println("age is repated two times its display single time");
		tr2.add(s4);
		tr2.add(s1);
		tr2.add(s2);
		tr2.add(s3);
		for(Student k: tr2)
		{
			System.out.println(k.getAge()+"   "+k.getMarks()+"   "+k.getSname()+"   "+k.getSid());
		}
		System.out.println("by marks");
		TreeSet<Student> tr3=new TreeSet(new stdbasedonmarks());
		tr3.add(s4);
		tr3.add(s1);
		tr3.add(s2);
		tr3.add(s3);
		for(Student k: tr3)
		{
			System.out.println(k.getAge()+"   "+k.getMarks()+"   "+k.getSname()+"   "+k.getSid());
		}
		
		

		
	}


}
