
public class Triangle extends Shape implements Movable {
	private int base, height;
	
	int getBase() {	return base;	}
	void setBase(int base) {	this.base = base;	}
	int getHeight() {	return height;	}
	void setHeight(int height) {	this.height = height;	}
	
	public void move(int dx, int dy) {
		super.x = dx;
		super.y = dy;
		System.out.println("»ï°¢Çü ÀÌµ¿ ÁÂÇ¥");
		System.out.println("x:" + x + ", y:" + y);
	}
	
	public void draw() {
		System.out.println("»ï°¢Çü ±×¸®±â");
	}
}