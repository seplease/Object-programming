import java.util.*;

public class A6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int rollno;
		int age;
		
		Student obj;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오.: ");
		name = sc.next();
		System.out.print("학번을 입력하시오.: ");
		rollno = sc.nextInt();
		System.out.print("나이를 입력하시오.: ");
		age = sc.nextInt();
		
		obj = new Student(name, rollno, age);
		obj.print();
	}
}