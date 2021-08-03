package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class concurHashMap {
	public static void main(String[] args) {
		Map<String, Integer> m=new ConcurrentHashMap<>();
		m.put("naresh", 1);
		m.put("sam",2);
		m.put("slokam", 3);
		m.put("slokam", 3);
		System.out.println(m);
		for (Map.Entry<String, Integer> entry : m.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                       ", Value = " + entry.getValue()); 
		 
		 System.out.println("for object ways");
		 stdinfo s1=new stdinfo(1, "naresh", 433);
		 stdinfo s2=new stdinfo(2, "sam", 435);
		 stdinfo s3=new stdinfo(3, "rams", 436);
		 stdinfo s4=new stdinfo(4, "praveen", 439);
		 stdinfo s5=new stdinfo(5, "radha", 440);
		 Map<stdinfo, Integer> m1=new ConcurrentHashMap<stdinfo, Integer>();
		m1.put(s1, 1);
		m1.put(s2, 2);
		m1.put(s3, 3);
		m1.put(s4, 4);
		m1.put(s5, 5);
		for (Entry<stdinfo, Integer> entry : m1.entrySet())
            System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());
		
	}

}
