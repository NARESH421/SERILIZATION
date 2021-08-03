package collections;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapAscDesc {
	public static void main(String[] args) {
		
		  Student s = new Student(1, "sai", 23, 454); 
		  Student s1 = new Student(2,"arun", 24, 500); 
		  Student s2 = new Student(3, "naresh", 25, 345); 
		  Student s3 = new Student(4, "madhu", 27, 766); 
		  Student s4 = new Student(5, "vam", 20, 454); 
		  Student s5 = new Student(6, "vam", 20, 456);
		  
		  Map<Student, Integer> n = null;
		  int ch;
		  do {
		  System.out.println("1 : BASED ON ID");
		  System.out.println("2 : BASED ON NAME");
		  System.out.println("3 : BASED ON AGE");
		  System.out.println("4 : BASED ON MARKS");
		  
		  Scanner sc = new Scanner(System.in);
		  int h = sc.nextInt();
		  System.out.println("1 : ASC");
		  System.out.println("2 : DSC");
		  
		  Scanner sc1 = new Scanner(System.in);
		  int x = sc1.nextInt();
		  
			  
		  if(h==1 && x==1) {
			  System.out.println("BASED ON ID & ASC");
			  n = new TreeMap<Student, Integer>(new stdbasedonId());
			  
		  }else if(h == 1 && x ==2) {
			  System.out.println("BASED ON ID & DSC");
			  n = new TreeMap<Student, Integer>(new stdbasedonId().reversed());
		  }
		  else if(h == 2 && x == 1) {
			  System.out.println("BASED ON NAME & ASC");
			  n = new TreeMap<Student, Integer>(new stdbasedonname());
		  }
		  else if(h == 2 && x ==2) {
			  System.out.println("BASED ON NAME & DSC");
			  n = new TreeMap<Student, Integer>(new stdbasedonname().reversed());
		  }
		  else if(h == 3 && x == 1) {
			  System.out.println("BASED ON AGE & ASC");
			  n = new TreeMap<Student, Integer>(new stdbasedonage());
		  }
		  else if(h == 3 && x ==2) {
			  System.out.println("BASED ON AGE & DSC");
			  n = new TreeMap<Student, Integer>(new stdbasedonage().reversed());
		  }
		  else if(h == 4 && x == 1) {
			  System.out.println("BASED ON MARKS & ASC");
			  n = new TreeMap<Student, Integer>(new stdbasedonmarks());
		  }
		  else if(h == 4 && x ==2) {
			  System.out.println("BASED ON MARKS & DSC");
			  n = new TreeMap<Student, Integer>(new stdbasedonmarks().reversed());
		  }
		  Set<Map.Entry<Student,Integer>> n1=n.entrySet();
			n.put(s, 1);
		  n.put(s1, 2);
		  n.put(s2, 3);
		  n.put(s3, 4);
		  n.put(s4, 5);
		  n.put(s5, 5);
		  for (Entry<Student, Integer> entry : n1)
			{
				System.out.println("Key = " + entry.getKey() +
                ", Value = " + entry.getValue());
		     }
		  System.out.println("do u want to continue press 9");
		ch=sc.nextInt();
		  }while(ch==9);
		  
}}



