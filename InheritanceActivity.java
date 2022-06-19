package oops.inheritence;

//Parent class/Super class
class Employee {
	// instance variable
	long empId;
	long empPhone;
	String empName;
	String empAddress;
	double basicSalary;
	double spAllounce = 250.80;
	double hra = 1000.50;

	// constructor
	public Employee(long empId, String empName, String empAddress, long empPhone, double basicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empPhone = empPhone;
		this.basicSalary = basicSalary;
	}

	// Method for calculate salary
	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * spAllounce / 100) + (basicSalary * hra / 100);
		System.out.println("Employee Salary is: " + salary);
	}

	// Method for calculate Calculate Transport Allowance
	public void calculateTransportAllowance() {
		double transportAllowance;

		transportAllowance = 0.1 * basicSalary;
		System.out.println("salary after calculating TransportAllowance: " + transportAllowance);
	}
}// End class Employee

//child class
class Manager extends Employee {

	public Manager(long empId, String empName, String empAddress, long empPhone, double basicSalary) {
		super(empId, empName, empAddress, empPhone, basicSalary);

	}

	// overriding
	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * spAllounce / 100) + (basicSalary * hra / 100);
		System.out.println("Manager Salary is: " + salary);
	}

	// overriding
	public void calculateTransportAllowance() {
		double transportAllowance;

		transportAllowance = 0.15 * basicSalary;
		System.out.println("Manager TransportAllowance: " + transportAllowance);
	}

}

//child class
class Trainee extends Employee {

	public Trainee(long empId, String empName, String empAddress, long empPhone, double basicSalary) {
		super(empId, empName, empAddress, empPhone, basicSalary);
	}

	// overriding
	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * spAllounce / 100) + (basicSalary * hra / 100);
		System.out.println("Trainee Salary is: " + salary);
	}

	// overriding
	public void calculateTransportAllowance() {
		double transportAllowance;

		transportAllowance = 0.1 * basicSalary;
		System.out.println("Trainee TransportAllowance: " + transportAllowance);
	}
}

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager manager = new Manager(126534, "Peter", "chennai India", 237844, 65000);
		manager.calculateSalary();
		Trainee trainee = new Trainee(29846, "jack", "Mumbai India", 442085, 45000);
		trainee.calculateSalary();

		manager.calculateTransportAllowance();
		trainee.calculateTransportAllowance();

	}
}
