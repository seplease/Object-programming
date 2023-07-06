
public class Person {
	String name;
	float height;
	float weight;

	public Person() {
		name = "È«±æµ¿";
		height = (float) 163.0; //163.0F ·Î ÇØµµ µÊ~!
		weight = (float) 48.5;
	}
	
	public Person(String n, float h, float w) {
		name = n;
		height = h;
		weight = w;
	}
	
	void print() {
		System.out.println("ÀÌ¸§ : " + name + ", Å°: " + height + ", ¸ö¹«°Ô : " + weight);
	}
}