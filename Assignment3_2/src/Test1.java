import java.util.*;
public class Test1 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userA;
		String userB;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		System.out.print("User A >> ");
		userA = sc.next();
		System.out.print("User B >> ");
		userB = sc.next();

		if(userA.equals("가위"))
		{
			if(userB.equals("가위"))
				System.out.println("A와 B가 비겼습니다.");
			else if(userB.equals("바위"))
				System.out.println("B가 이겼습니다.");
			else if(userB.equals("보"))
				System.out.println("A가 이겼습니다.");
		}
		else if(userA.equals("바위"))
		{
			if(userB.equals("바위"))
				System.out.println("A와 B가 비겼습니다.");
			else if(userB.equals("보"))
				System.out.println("B가 이겼습니다.");
			else if(userB.equals("가위"))
				System.out.println("A가 이겼습니다.");
		}
		else if(userA.equals("보"))
		{
			if(userB.equals("보"))
				System.out.println("A와 B가 비겼습니다.");
			else if(userB.equals("가위"))
				System.out.println("B가 이겼습니다.");
			else if(userB.equals("바위"))
				System.out.println("A가 이겼습니다.");
		}
	}
}