interface Movable {
	void move(int dx, int dy);
}

public class Shape implements Movable {
	protected int x, y;
	
	public void draw() {
		
	}
	
	public void move(int dx, int dy) {
		this.x = dx;
		this.y = dy;

		System.out.println("Movable Ÿ�� ��ü �迭- ShapeŬ�������� �������̽� ����");
	}
}

//https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=lwj798&logNo=220685928734