import java.lang.Math; 

public class Dice {
	
	private int value;
	
	public Dice() {		value=0;		}
	
	public int getValue() {		return value;		}
	public void setValue(int value) {		this.value=value;		}
	public int roll() {		value=(int)(Math.random() * 6) + 1;		return value;		}
}