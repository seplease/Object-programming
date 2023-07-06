import java.util.*;
public class A4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자를 입력하세요: ");
			str = sc.next();
			switch(str) {
			case "a" : case "e" : case "i" : case "o" : case "u" :
			case "A" : case "E" : case "I" : case "O" : case "U" :
				System.out.println("모음입니다.");
				break;

			case "quit" :
				System.out.println("프로그램 종료!");
				break;
				
			default :
				System.out.println("자음입니다.");
				break;	
			}
			if (str.equals("quit")) //(!alpha.equals("quit"))
				break;
		}
	}

}
