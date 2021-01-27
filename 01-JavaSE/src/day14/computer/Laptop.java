package day14.computer;

public class Laptop {
	private int no;
	private double price;
	private InsertDrawable ID;

	public Laptop() {
	}

	public Laptop(int no, double price, InsertDrawable ID) {
		this.no = no;
		this.price = price;
		this.ID = ID;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public InsertDrawable getID() {
		return ID;
	}

	public void setID(InsertDrawable ID) {
		this.ID = ID;
	}

	public void Connect() {
		ID.Game();
		ID.Write();
	}
}
