import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int max = -99999;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
		num2 = sc.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���: ");
		num3 = sc.nextInt();
		
		if (num1 > num2)
		{
			max = num1;
			if (num3 > max)
				max = num3;
		}
		else if (num1 < num2)
		{
			max = num2;
			if (num3 > max)
				max = num3;
		}
		else if (num1 > num3)
		{
			max = num1;
			if (num2 > max)
				max = num2;
		}
		else if (num1 < num3)
		{
			max = num3;
			if (num2 > max)
				max = num2;
		}
		else if (num2 > num3)
		{
			max = num2;
			if (num1 > max)
				max = num1;
		}
		else if (num2 < num3)
		{
			max = num3;
			if (num1 > max)
				max = num1;
		}
		
		
		/*
		 if (num1 > num2)
		 {
			 if (num1 > num3)
			 	max = num1;
			 else
			 	max = num3;
		 }
		 else
		 {
			 if (num2 > num3)
			 	max = num2;
			 else
			 	max = num3;
		 }
		 */
		System.out.println("���� ū ���ڴ� " + max + "�Դϴ�.");
	}

}
