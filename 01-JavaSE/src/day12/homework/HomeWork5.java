package day12.homework;

public class HomeWork5 {
	public static void main(String[] args) {
		MyTime mt = new MyTime(16, 11, 12);
		mt.display();
		System.out.println("增加的时间为：" + mt.judgeHour(3661) + "时" + mt.judgeMinute(3661) + "分" + mt.judgeSecond(3661) + "秒");
	}
}
class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime() {
	}

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
//	显示时间
	public void display() {
		if (minute < 10) {
			System.out.println(hour + " 时 " + "0" +  minute + " 分 " + second + " 秒");
		} else if (second < 10) {
			System.out.println(hour + " 时 " +  minute + " 分 " + "0" + second + " 秒");
		}else {
			System.out.println(getHour() + " 时 " +  getMinute() + " 分 " + getSecond() + " 秒");
		}
	}
// 加秒
	public int addSecond(int sec) {
		return judgeSecond(sec) + this.getSecond();
	}
// 加分
	public int addMinute(int min) {
		return judgeMinute(min);
	}
//加时
	public void addHour(int hour) {

	}
// 加秒
	public void subSecond(int sec) {

	}
// 加分
	public void subMinute(int min) {

	}
//加时
	public void subHour(int hour) {

	}
//时进1
	public int judgeHour(int t) {
		return t / 3600;
	}
//分进1
	public int judgeMinute(int t) {
		return (t - judgeHour(t) * 3600) / 60;
	}
//秒进1
 public int judgeSecond(int t) {
		return (t - judgeHour(t) * 3600 - judgeMinute(t) * 60) % 60;
 }
}
