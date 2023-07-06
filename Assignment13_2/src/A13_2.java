
public class A13_2 {
	public static void main(String[] args) {
		Movable [] list = new Shape[3];
		Movable obj = new Shape();
		int x, y;
		
		for (int i = 0; i < list.length; i++) {
			list[0] = new Rectangle();
			list[1] = new Triangle();
			list[2] = new Circle();	
			
			x = (int)(Math.random()*100);
			y = (int)(Math.random()*100);
			obj.move(x, y);
			
			x = (int)(Math.random()*100);
			y = (int)(Math.random()*100);
			((Rectangle)list[0]).draw();
			list[0].move(x, y);
			
			x = (int)(Math.random()*100);
			y = (int)(Math.random()*100);
			((Triangle)list[1]).draw();
			list[1].move(x, y);
			
			x = (int)(Math.random()*100);
			y = (int)(Math.random()*100);
			((Circle)list[2]).draw();
			list[2].move(x, y);
		}
	}
}