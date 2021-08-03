package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class map {
	public static void main(String[] args) {
		//HashMap
		//LinkedHashMap
		//TreeMap
		
		
		/*System.out.println("------------------HASH MAP---------------------");
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("naresh", 1);
		m.put("ramesh", 4);
		m.put("naresh", 5);
		m.put("apple", 3);
		m.put("cat", 2);
		m.put(null, 9);
		m.put(null, 10);
		System.out.println(m+"hash map");
		System.out.println(m.keySet()+"its keys");
		System.out.println(m.values()+"its values");
		 for (Map.Entry<String, Integer> entry : m.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                         ", Value = " + entry.getValue()); 
		//all data acepted but not accept double time its override automatically null accepted but only once
		System.out.println("------------------LINKED HASH MAP---------------------");
		Map<String,Integer> m1=new LinkedHashMap<String,Integer>();
		//m1=new TreeMap<String,Integer>();
		m1.put("naresh", 1);
		m1.put("ramesh", 4);
		m1.put("naresh", 5);
		m1.put("apple", 3);
		m1.put("cat", 2);
		m1.put(null, 10);
		
		System.out.println(m1+"LINKED hash map");
		System.out.println(m1.keySet()+"its keys");
		System.out.println(m1.values()+"its values");
		 for (Map.Entry<String, Integer> entry : m1.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                         ", Value = " + entry.getValue()); 
		//its not accepted null and duplicate data and data is displayed by wchich type of way we are put
		System.out.println("------------------TREE HASH MAP---------------------");
		Map<String,Integer> m2=new TreeMap<String,Integer>();
		m2.put("naresh", 1);
		m2.put("ramesh", 4);
		m2.put("naresh", 5);
		m2.put("apple", 3);
		m2.put("cat", 2);
		
		System.out.println(m2+"TREE map");
		System.out.println(m2.keySet()+"its keys");
		System.out.println(m2.values()+"its values");
		 for (Map.Entry<String, Integer> entry : m2.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                         ", Value = " + entry.getValue());
	                         */ 
		//its not accepted null and duplicate data and data is displayed by ascending order by name
		System.out.println("======================hashmap===================");
		Student s1=new Student(1, "naresh", 432, 22);
		Student s2=new Student(2, "apple", 423, 25);
		Student s3=new Student(4, "ball", 487, 28);
		Student s4=new Student(3, "donkey", 420, 12);
		Student s5=new Student(5, "naresh", 493, 32);
		Map<Student,Integer> m=new HashMap<>();
		m.put(s1, 1);
		m.put(s2, 2);
		m.put(s3, 3);
		m.put(s4, 4);
		m.put(s5, 5);
		m.put(null, 8);
		m.put(null, 9);
		m.put(s2, 9);
		System.out.println(m.values()+"    values");
		System.out.println(m.size()+"    size");
		System.out.println(m.containsKey(s5));
		System.out.println(m.containsValue(1));
		System.out.println(m.keySet());
		for (Entry<Student, Integer> entry : m.entrySet())
            System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());
     
		System.out.println("======================Linkedhashmap===================");
		Student l1=new Student(1, "naresh", 432, 22);
		Student l2=new Student(2, "apple", 423, 25);
		Student l3=new Student(4, "ball", 487, 28);
		Student l4=new Student(3, "donkey", 420, 12);
		Student l5=new Student(1, "cat", 493, 32);
		Student l6=new Student(6, null, 493, 32);
		Student l7=new Student(7, null, 493, 32);

		Map<Student,Integer> m1=new LinkedHashMap<>();
		m1.put(s2, 2);
		m1.put(s1, 1);
		m1.put(s5, 5);
		m1.put(s3, 3);
		m1.put(s4, 4);
		m1.put(null, 8);
		m1.put(null, 9);
		
		System.out.println(m1.keySet());
		System.out.println(m1.values()+"values");
		System.out.println(m1.size()+"size");
		System.out.println(m1.containsKey(s5));
		System.out.println(m1.containsValue(1));
		
		Set<Map.Entry<Student,Integer>> n1=m.entrySet();
		for (Entry<Student, Integer> entry : m1.entrySet())
            System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());
     
		System.out.println("=====================Treemap===================");
		Student t1=new Student(1, "naresh", 432, 22);
		Student t2=new Student(2, "apple", 423, 25);
		Student t3=new Student(4, "ball", 487, 28);
		Student t4=new Student(3, "donkey", 420, 12);
		Student t5=new Student(1, "cat", 493, 32);
		Map<Student,Integer> tr=new TreeMap<>(new stdbasedonmarks());
		tr.put(s1, 1);
		tr.put(s2, 2);
		tr.put(s3, 3);
		tr.put(s4, 4);
		tr.put(s5, 5);
		System.out.println(tr.keySet());
		System.out.println(tr.values()+"values");
		System.out.println(tr.size()+"size");
		System.out.println(tr.containsKey(s5));
		System.out.println(tr.containsValue(1));
		for (Entry<Student, Integer> entry : tr.entrySet())
            System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());
     
		
	}

	

}
