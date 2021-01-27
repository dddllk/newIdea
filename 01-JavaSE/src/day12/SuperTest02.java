package day12;
/*
	在举个例子：在恰当的时间使用：super(实际参数列表)
 */
public class SuperTest02 {
	public static void main(String[] args) {
		CreditAccount ca = new CreditAccount();
	}
}
// 账户
class Account {
	// 属性
	private String actno;
	private double balance;
	// 构造方法
	public Account() {

	}
	public Account(String actno, double balance) {
		this.actno = actno;
		this.balance = balance;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
// 信用账户
class CreditAccount extends Account {
	private double credit;
	// 构造方法
	public CreditAccount() {

	}
	// 有参数的构造方法
	public CreditAccount(String actno, double balance, double credit) {
		// 通过子类的构造方法调用父类的构造方法
		super(actno, balance);
		this.credit = credit;
	}
	// setter and getter
	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}
}
