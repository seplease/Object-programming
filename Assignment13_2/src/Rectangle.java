
public class Rectangle extends Shape implements Movable {
	private int width, height;
	
	int getWidth() {	return width;	}
	void setWidth(int width) {	this.width = width;	}
	int getHeight() {	return height;	}
	void setHeight(int height) {	this.height = height;	}
		
	public void move(int dx, int dy) {
		super.x = dx;
		super.y = dy;
		System.out.println("�簢�� �̵� ��ǥ");
		System.out.println("x:" + x + ", y:" + y);
	}
	
	public void draw() {
		System.out.println("�簢�� �׸���");
	}
}