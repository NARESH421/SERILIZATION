package collections;

import java.util.WeakHashMap;

public class weakhashmap {
	public static void main(String[] args) {
		Student s = new Student(1, "sai", 23, 454); 
		  Student s1 = new Student(2,"arun", 24, 500); 
		  Student s2 = new Student(3, "naresh", 25, 345); 
		  Student s3 = new Student(4, "madhu", 27, 766); 
		  Student s4 = new Student(5, "madh", 27, 766);
		  Student s5 = new Student(6, "vam", 21, 456);
		  
		  WeakHashMap<Student, Integer> n = new WeakHashMap<Student, Integer>();
		  
		  n.put(s, 1);
		  n.put(s1, 2);
		  n.put(s2, 3);
		  n.put(s3, 4);
		  n.put(s4, 5);
		  n.put(s5, 6);
		  
		  System.out.println("***** Initial Size -----" + n.size());
		  s1=null;
		  s2=null;
		  
		  System.gc();
		  Runtime.getRuntime().gc();
		  
		  System.gc();
		  Runtime.getRuntime().gc();
		  System.gc();
		  Runtime.getRuntime().gc();
		  System.gc();
		  Runtime.getRuntime().gc();
		  System.gc();
		  Runtime.getRuntime().gc();
		  System.gc();
		  Runtime.getRuntime().gc();
		  System.gc();
		  Runtime.getRuntime().gc();
		  System.gc();
		  Runtime.getRuntime().gc();
		  System.gc();
		  Runtime.getRuntime().gc();
		  System.gc();
		  Runtime.getRuntime().gc();
		  System.gc();
		  Runtime.getRuntime().gc();
		  
		  System.gc();
		  Runtime.getRuntime().gc();
		  System.gc();
		  Runtime.getRuntime().gc();
		  
		  System.out.println("***** FINAL SIZE -----" + n.size());
		  
	}

}
