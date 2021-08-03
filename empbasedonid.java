package collections;

import java.util.Comparator;

public class empbasedonid implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEid().compareTo(emp2.getEid());
	}

}
