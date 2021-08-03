package collections;

import java.util.ArrayList;
import java.util.List;

public class ClonePurpose {
	public static void main(String[] args) {
		stdinfo s1=new stdinfo(1, "naresh", 345);
		stdinfo s2=new stdinfo(2, "sai", 375);
		stdinfo s3=new stdinfo(3, "varun", 357);
		
		List<stdinfo> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		s1.setName("apple");
		s2.setMarks(6789);
		s3.setId(10);
		 Object arrayListClone =  ((ArrayList<stdinfo>) list).clone();
         
	        System.out.println(arrayListClone);   

		
	}

}
