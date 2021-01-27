package day16.random.test;

public class Student {
	private int no;
	private boolean flag;

	public Student() {
	}

	public Student(int no, boolean flag) {
		this.no = no;
		this.flag = flag;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "学生["+ no +"," +(flag ? "出勤" : "旷课") + "]";
	}
}
