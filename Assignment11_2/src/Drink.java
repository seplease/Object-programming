
public class Drink extends Food{
	String name = "ÄÝ¶ó";
	int price = 1500;
	String size = "small";
	
	public void setSize(String size) { this.size = size; }
	public String getSize() { return size; }
	
	public Drink() {
		
	};
	public Drink(String name, int price) {
		this.name = name;
		this.price = price;
	};
	public Drink(String name, int price, String size) {
		this.name = name;
		this.price = price;
		this.size = size;
	};
}
