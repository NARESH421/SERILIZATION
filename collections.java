package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import deadE.Student;

public class collections {
public static void main(String[] args) {
	Student std=new Student();
	List l=new ArrayList<Student>();
	std.setId(1);
	std.setName("aa");
	l.add(std);
	
	System.out.println(l.size());
	ArrayList ar=new ArrayList();
	ar.add(1);
	ar.add(2);
	System.out.println("arraylist element is");
	System.out.println(ar);
	System.out.println("arraylist size is"+ar.size());
	System.out.println("empyty or not    "+ar.isEmpty());
	
LinkedList a=new LinkedList();
a.add(1);
a.add(2);
a.add("nari");
a.add(3.3f);
a.add(45.77d);
System.out.println("linkedlist elements is");
System.out.println(a);
System.out.println(a.size());

	
}
}
