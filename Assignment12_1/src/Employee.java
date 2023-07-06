
public class Employee {
	private String name;
	private int id;
	private String position;

	String getName() {	return name;	}
	void setName(String name) {	this.name = name;	}
	int getId() {	return id;	}
	void setId(int id) {	this.id = id;	}
	String getPosition() {	return position;	}
	void setPosition(String position) {	this.position = position;	}

	public Employee() {
		name = "모름";
		id = -1;
		position = "모름";
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int computeSalary() {
		return -1;
	}

	public String toString() {
		return getName() + "(" + getPosition() + ", " + getId() + ")";
	}
}