import java.util.*;
public class A4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			str = sc.next();
			switch(str) {
			case "a" : case "e" : case "i" : case "o" : case "u" :
			case "A" : case "E" : case "I" : case "O" : case "U" :
				System.out.println("�����Դϴ�.");
				break;

			case "quit" :
				System.out.println("���α׷� ����!");
				break;
				
			default :
				System.out.println("�����Դϴ�.");
				break;	
			}
			if (str.equals("quit")) //(!alpha.equals("quit"))
				break;
		}
	}

}
