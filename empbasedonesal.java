package collections;

import java.util.Comparator;

public class empbasedonesal implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1,Employee emp2) {
		
		return emp1.getEsal().compareTo(emp2.getEsal());
	}

}
