package bean;

import java.util.Comparator;

public class SortSalDsc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getSalary()-o1.getSalary());
	}

}
