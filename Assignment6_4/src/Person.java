
public class Person {
	String name;
	float height;
	float weight;

	public Person() {
		name = "ȫ�浿";
		height = (float) 163.0; //163.0F �� �ص� ��~!
		weight = (float) 48.5;
	}
	
	public Person(String n, float h, float w) {
		name = n;
		height = h;
		weight = w;
	}
	
	void print() {
		System.out.println("�̸� : " + name + ", Ű: " + height + ", ������ : " + weight);
	}
}