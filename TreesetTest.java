package collections;

import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class TreesetTest{
	public static void main(String[] args) 
	{
		final Logger LOGGER=LoggerFactory.getLogger(TreesetTest.class);
		LOGGER.info("HI NARESH");

		TreeSet<Student> tr=new TreeSet();
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
		
		tr.add(s4);
		tr.add(s1);
		tr.add(s2);
		tr.add(s3);
//		System.out.println(tr);
		for(Student k: tr)
		{
			System.out.println(k.getAge()+"   "+k.getMarks()+"   "+k.getSname()+"   "+k.getSid());
		}
	}
}