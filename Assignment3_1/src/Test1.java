import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String operator;
		double num1;
		double num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		operator = sc.next();
		
		System.out.print("���� 2���� �Է��ϼ���(ex. 3 23): ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		if (operator.equals("+"))
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		else if (operator.equals("-"))
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		else if (operator.equals("*"))
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		else if (operator.equals("/"))
		{
			if (num2 != 0)
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			else
				System.out.println("������ ������ �� ����");
		}
	}
}