
public class Circle extends Shape implements Movable {
	private int radius;
	
	int getRadius() {	return radius;	}
	void setRadius(int radius) {	this.radius = radius;	}
	
	public void move(int dx, int dy) {
		super.x = dx;
		super.y = dy;
		System.out.println("�� �̵� ��ǥ");
		System.out.println("x:" + x + ", y:" + y);
	}
	
	public void draw() {
		System.out.println("�� �׸���");
	}
}