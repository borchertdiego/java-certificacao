package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
	}

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salary;
	}
	
	public void salaryIncrease(double percentage) {
		salary += (salary * (percentage / 100.0));
	}

	public String toString() {
		return id
			 + ", "
			 + name
			 + ", "
			 + String.format("%.2f", salary);
	}
}