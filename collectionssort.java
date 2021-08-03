package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionssort {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add(2);
	list.add(9);
	list.add(5);
	list.add(8);
	System.out.println(list+"befor sort");
	Collections.sort(list);
	System.out.println(list+"after sort");
	/*
	 * Student s1=new Student(1, "naresh", 456, 22); Student s2=new Student(5,
	 * "mahesh", 500, 23); Student s3=new Student(2, "zeebra", 453, 19); Student
	 * s4=new Student(4, "ball", 547, 24); Student s5=new Student(3, "ball", 541,
	 * 29);
	 */
	Student s1=new Student();
	s1.setAge(22);
	s1.setSid(1);
	s1.setMarks(456);
	s1.setSname("naresh");

	Student s2=new Student();
	s2.setAge(23);
	s1.setSid(5);
	s1.setMarks(500);
	s1.setSname("mahesh");
	

	Student s3=new Student();
	s3.setAge(19);
	s1.setSid(2);
	s1.setMarks(453);
	s1.setSname("zeebrz");
	

	Student s4=new Student();
	s1.setAge(24);
	s1.setSid(4);
	s1.setMarks(459);
	s1.setSname("ball");
	

	Student s5=new Student();
	s1.setAge(25);
	s1.setSid(5);
	s1.setMarks(455);
	s1.setSname("zeebra");
	List<Student> list1=new ArrayList<Student>();
	list1.add(s1);
	list1.add(s2);
	list1.add(s3);
	list1.add(s4);
	list1.add(s5);
	//System.out.println(list1);
	Collections.sort(list1,new stdbasedonname());
	for (Student k : list1) {
	System.out.println(k);	
	}
	//System.out.println(list1);
}
}
