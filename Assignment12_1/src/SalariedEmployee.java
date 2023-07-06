
public class SalariedEmployee extends Employee {
	private int monthly;
	private String name;
	private int id;

	public SalariedEmployee() {

	}

	public SalariedEmployee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	int getMonthly() {	return monthly;	}
	void setMonthly(int monthly) {	this.monthly = monthly;}

	public int computeSalary() {
		return monthly * 12;
	}

	public String toString() {
		return super.toString() + "¿« ø¨∫¿¿∫ " + computeSalary();
	}
}