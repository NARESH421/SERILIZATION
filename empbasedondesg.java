package collections;

import java.util.Comparator;

public class empbasedondesg implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1,Employee emp2) {
		
		return emp1.getEdesg().compareTo(emp2.getEdesg());
	}

}
