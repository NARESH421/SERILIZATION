package collections;

import java.util.Comparator;

public class empbasedonname implements Comparator<Employee> {

	

	@Override
	public int compare(Employee emp1, Employee emp2) {
		int c=emp1.getEname().compareTo(emp2.getEname());
		if(c==0)
		{
			 c=emp1.getEdept().compareTo(emp2.getEdept());
		}
		return c;
		
	}
}
