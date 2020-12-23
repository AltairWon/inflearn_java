package hiding;


class BirthDay{
	
	private int day;
	private int month;
	private int year; // class 안에서만 사용을 할 수 있는 것이 private
	
	public int getDay() { // private 안에서 사용을 할 수 있도록 하기 위해서 public을 선언을 할 수 있다.
		return day;
	}
	
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("Day error.");
			}
		}
		else {
			this.day = day; //this = 자기 자신의 메모리를 가리킴. 생성된 메모리의 주소를 가리킴.
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}

public class BirthDayTest {
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2018);
	}
}

