
public class Circle extends Shape implements Movable {
	private int radius;
	
	int getRadius() {	return radius;	}
	void setRadius(int radius) {	this.radius = radius;	}
	
	public void move(int dx, int dy) {
		super.x = dx;
		super.y = dy;
		System.out.println("원 이동 좌표");
		System.out.println("x:" + x + ", y:" + y);
	}
	
	public void draw() {
		System.out.println("원 그리기");
	}
}