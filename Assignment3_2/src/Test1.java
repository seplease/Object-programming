import java.util.*;
public class Test1 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userA;
		String userB;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		
		System.out.print("User A >> ");
		userA = sc.next();
		System.out.print("User B >> ");
		userB = sc.next();

		if(userA.equals("����"))
		{
			if(userB.equals("����"))
				System.out.println("A�� B�� �����ϴ�.");
			else if(userB.equals("����"))
				System.out.println("B�� �̰���ϴ�.");
			else if(userB.equals("��"))
				System.out.println("A�� �̰���ϴ�.");
		}
		else if(userA.equals("����"))
		{
			if(userB.equals("����"))
				System.out.println("A�� B�� �����ϴ�.");
			else if(userB.equals("��"))
				System.out.println("B�� �̰���ϴ�.");
			else if(userB.equals("����"))
				System.out.println("A�� �̰���ϴ�.");
		}
		else if(userA.equals("��"))
		{
			if(userB.equals("��"))
				System.out.println("A�� B�� �����ϴ�.");
			else if(userB.equals("����"))
				System.out.println("B�� �̰���ϴ�.");
			else if(userB.equals("����"))
				System.out.println("A�� �̰���ϴ�.");
		}
	}
}