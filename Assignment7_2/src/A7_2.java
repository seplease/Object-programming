
public class A7_2 {

	public static void main(String[] args) {
		Dice dice1=new Dice();
		Dice dice2=new Dice();
		int count = 0;
		
		while(true) {
			dice1.setValue(dice1.roll());
			dice2.setValue(dice2.roll());
			System.out.println("�ֻ���1= "+dice1.getValue()+" �ֻ���2= "+ dice2.getValue());
			count++;
			if(dice1.getValue() + dice2.getValue() == 2) {
				break;
			}
		}
		System.out.println("(1,1)�� �����µ� �ɸ� Ƚ��="+count);
	}
}
