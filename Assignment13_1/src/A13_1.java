
public class A13_1 {
	public static void main(String[] args) {
		Point a = new Point(2, 3);	
		Point b = new Point(2, 3);		
		Point c = new Point(3, 4);
		Point aa = new Point();	
		aa = a;
		
		if (a == b)
			System.out.println("a�� b�� �ּҰ� ����");
		else
			System.out.println("a�� b�� �ּҰ� �ٸ���");
		if (aa == a)
			System.out.println("a�� aa�� �ּҰ���(a==aa)");
		else
			System.out.println("a�� aa�� �ּҴٸ���(a!=aa)");
		if (a.equals(b))
			System.out.println("a is equal to b");
		else
			System.out.println("a is not equal to b");
		
		if (a.equals(c))
			System.out.println("a is equal to c");
		else
			System.out.println("a is not equal to c");
	}
}