package interfaceJava8;

interface Employee {
	// abstract method -- must be overridden in sub-classes
	double getSal();
	
	// default implementation of the method -- may or may not be overridden in sub-classes (as per requirement)
	default double getIncome() {
		return getSal();
	}

	// Java 8 onwards, static methods are allowed in interface
	public static double totalEmpExpenses(Employee[] arr) {
		double total = 0.0;
		for (Employee e : arr) {
			total = total + e.getIncome();
		}
		return total;
	}
}

/*
// before Java8 -- if any helper functionality is required related to interface
// a separate class was created with static methods.
class Employees {
	public static double totalEmpExpenses(Employee[] arr) {
		double total = 0.0;
		for (Employee e : arr) {
			total = total + e.getIncome();
		}
		return total;
	}
}
*/


class Clerk implements Employee {
	private double sal;
	public Clerk() {
		this.sal = 2000;
	}
	@Override
	public double getSal() {
		return this.sal;
	}
	// since getIncome() is not overridden, the default impl from the interface is used.
}


class Manager implements Employee {
	private double sal;
	private double bonus;
	public Manager() {
		this.sal = 10000;
		this.bonus = 5000;
	}
	@Override
	public double getSal() {
		return this.sal;
	}
	@Override
	public double getIncome() {
		return this.sal + this.bonus;
	}
}

class Salesman implements Employee {
	private double sal;
	private double comm;
	public Salesman() {
		this.sal = 4000;
		this.comm = 3000;
	}
	@Override
	public double getSal() {
		return this.sal;
	}
	@Override
	public double getIncome() {
		return this.sal + this.comm;
	}
}


public class StaticFunction {
	
	public static void main(String[] args) {
		Clerk c = new Clerk();
		System.out.println("c income: " + c.getIncome());
		Salesman s = new Salesman();
		System.out.println("s income: " + s.getIncome());
		Manager m = new Manager();
		System.out.println("m income: " + m.getIncome());

		// "arr" is array of Employee references
		Employee[] arr = {c, s, m};
		//double total = Employees.totalEmpExpenses(arr);
		double total = Employee.totalEmpExpenses(arr);
		System.out.println("Total Emp Expenses: " + total);
		
	}
}


