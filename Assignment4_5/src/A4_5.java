import java.util.*;

public class A4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		double max = 0.0;
		int i;
		
		ArrayList<Double> list=new ArrayList<>();
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		for (Double num : list) {
			System.out.print(num + " ");
		}
		
		for (i = 0; i < 4; i++) {
			sum += list.get(i);
			if (list.get(i) > max)
				max = list.get(i);
		}
		
		System.out.println("");
		System.out.println("합은 " + sum);
		System.out.println("최대값은 " + max);
	}

}