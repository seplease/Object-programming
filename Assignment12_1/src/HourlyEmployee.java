
public class HourlyEmployee extends Employee {
	private int rate;
	private int hours;
	private String name;
	private int id;
	
	public HourlyEmployee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public HourlyEmployee(int rate, int hours) {
		this.rate = rate;
		this.hours = hours;
	}

	int getRate() {		return rate;	}
	void setRate(int rate) {	this.rate = rate;	}
	int getHours() {	return hours;	}
	void setHours(int hours) {	this.hours = hours;	}

	public int computeSalary() {
		return hours * rate;
	}
	
	public String toString() {
		return super.toString() + "의 지급급여는 " + computeSalary();
	}
}