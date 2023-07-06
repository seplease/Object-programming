
public class Date {
	public int year;
	public int month;
	public int day;
	
	public int getYear() {		return year;		}
	public void setYear(int y) {		this.year = y;		}
	public int getMonth() {		return month;		}
	public void setMonth(int m) {		this.month = m;		}
	public int getDay() {		return day;		}
	public void setDay(int d) {			this.day = d;		}
	public int getAge () {		return 2021 - year + 1;		}
}