
public class MyColorPoint extends MyPoint {
	String color;

	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void move(int x, int y) {
		super.x = x;
		super.y = y;
	}
	public void reverse() {
		int rev;
		rev = x;
		x = y;
		y = rev;
	}
	protected void show() {
		super.show();
		System.out.println("," + color);
	}
}