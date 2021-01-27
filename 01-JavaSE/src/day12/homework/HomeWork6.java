package day12.homework;

public class HomeWork6 {
	public static void main(String[] args) {
		BasePlusSalesEmployee bpse = new BasePlusSalesEmployee("dd",12,10000,0.5,2500);
		System.out.println(bpse.getSalary(bpse));
	}
}
class Employee {
	private String name;
	private int month;
	private int salary;
	public Employee() {
	}

	public Employee(String name, int month) {
		this.name = name;
		this.month = month;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	public void getSalary(int month) {
		if(this.getMonth() == month) {
			salary = salary + 100;
		}
	}
}
class SalariedEmployee extends Employee {
	private int monthlySalary;

	public SalariedEmployee(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public SalariedEmployee(String name, int month, int monthlySalary) {
		super(name, month);
		this.monthlySalary = monthlySalary;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
}
class HourlyEmployee extends Employee {
  private int hourlySalary;
  private int hour;

	public HourlyEmployee(String name, int month, int hourlySalary, int hour) {
		super(name, month);
		this.hourlySalary = hourlySalary;
		this.hour = hour;
	}

	public int getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getSalary(HourlyEmployee he) {
		return he.getHour() * he.getHourlySalary();
	}
}
class SalesEmployee extends Employee {
  private int sale;
  private double royalty_rate;

	public SalesEmployee() {
	}

	public SalesEmployee(String name, int month, int sale, double royalty_rate) {
		super(name, month);
		this.sale = sale;
		this.royalty_rate = royalty_rate;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public double getRoyalty_rate() {
		return royalty_rate;
	}

	public void setRoyalty_rate(double royalty_rate) {
		this.royalty_rate = royalty_rate;
	}

	public double getSalary(SalesEmployee se) {
		return se.getSale() * se.royalty_rate;
	}
}
class BasePlusSalesEmployee extends SalesEmployee {
	private int baseSalary;

	public BasePlusSalesEmployee(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public BasePlusSalesEmployee(String name, int month, int sale, double royalty_rate, int baseSalary) {
		super(name, month, sale, royalty_rate);
		this.baseSalary = baseSalary;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double getSalary(BasePlusSalesEmployee bpse) {
		return super.getSalary(bpse) + this.getBaseSalary();
	}
}