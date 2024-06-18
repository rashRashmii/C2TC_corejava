package edu.atria.java.oops;

//class
public class Employee {
	// data members
	private int id;
	private String name;
	private Double Salary;
	private String Designation;

	// parameterized constructor
	public Employee(int id, String name, Double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		Designation = designation;
	}

	// getters(get the data) and setters(set the data)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		// here id is the temporary variable and it assigns it to this.id.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", Designation=" + Designation + "]";
	}
}
