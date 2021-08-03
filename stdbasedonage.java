package collections;

import java.util.Comparator;

public class stdbasedonage implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		int c= o1.getAge().compareTo(o2.getAge());
		if(c==0)
		{
			System.out.println("by id");
			 c= o1.getSid().compareTo(o2.getSid());
		}
		return c;
	}
	//here age is repeated two times but data is different, so we need other data also,so comparasion by id or dependeds 

}
