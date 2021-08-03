package collections;

import java.util.Comparator;

public class stdbasedonId implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) { 
		int c=o1.getSid().compareTo(o2.getSid());
		return c;
	}

}
//actually comparator had two methods compare and equals method but here override only compare but not 
//override equals method because its already override in parent class so no need that is reason very imp