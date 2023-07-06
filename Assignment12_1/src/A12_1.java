import java.util.*;

public class A12_1 {
	public static void main(String[] args) {
		String name;
		int id;
		String position;
		int monthly;
		int rate;
		int hours;
		
		Scanner sc = new Scanner(System.in);

		Employee e0 = new Employee("모름", -1);
		SalariedEmployee e1 = new SalariedEmployee("모름", -1);
		HourlyEmployee e2 = new HourlyEmployee("모름", -1);

		System.out.print("이름은? ");
		name = sc.next();
		System.out.print("직원번호는? ");
		id = sc.nextInt();
		System.out.print("직급은? ");
		position = sc.next();
		
		e0.setName(name);
		e0.setId(id);
		e0.setPosition(position);
		System.out.println(e0.toString() + "\n");

		System.out.print("이름은? ");
		name = sc.next();
		System.out.print("직원번호는? ");
		id = sc.nextInt();
		System.out.print("직급은? ");
		position = sc.next();
		System.out.print("월급은? ");
		monthly = sc.nextInt();
		
		e1.setName(name);
		e1.setId(id);
		e1.setPosition(position);
		e1.setMonthly(monthly);
		System.out.println(e1.toString() + "\n");

		System.out.print("이름은? ");
		name = sc.next();
		System.out.print("직원번호는? ");
		id = sc.nextInt();
		System.out.print("직급은? ");
		position = sc.next();
		System.out.print("시급은? ");
		rate = sc.nextInt();
		System.out.print("일한시간은? ");
		hours = sc.nextInt();

		e2.setName(name);
		e2.setId(id);
		e2.setPosition(position);
		e2.setRate(rate);
		e2.setHours(hours);
		System.out.println(e2.toString() + "\n");
	}
}