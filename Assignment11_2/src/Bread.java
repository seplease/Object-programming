
public class Bread extends Food {
	String name = "µµ³Ó";
	int price = 2000;
	int num = 3;
	
	public void setNum(int num) { this.num = num; }
	public int getNum() { return num; }
	
	public Bread() {
		
	};
	public Bread(String name, int price) {
		this.name = name;
		this.price = price;
	};
	public Bread(String name, int price, int num) {
		this.name = name;
		this.price = price;
		this.num = num;
	};
}
