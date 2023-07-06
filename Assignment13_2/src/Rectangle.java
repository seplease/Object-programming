
public class Rectangle extends Shape implements Movable {
	private int width, height;
	
	int getWidth() {	return width;	}
	void setWidth(int width) {	this.width = width;	}
	int getHeight() {	return height;	}
	void setHeight(int height) {	this.height = height;	}
		
	public void move(int dx, int dy) {
		super.x = dx;
		super.y = dy;
		System.out.println("사각형 이동 좌표");
		System.out.println("x:" + x + ", y:" + y);
	}
	
	public void draw() {
		System.out.println("사각형 그리기");
	}
}