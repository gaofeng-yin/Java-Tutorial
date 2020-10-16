import java.util.Date;

public class DebitCard {
	
	private Date createdDate;
	
	private String name;
	
	private int niff;
	
	private double balance;
	
	DebitCard(String name, int niff, Date date, double balance){
		if(balance < 150) {
			System.out.println(name + " can't open account because balance must be greater than 150 to open account.");
		}else {
		this.name = name;
		this.niff = niff;
		this.createdDate = date;
		this.balance = balance;
		System.out.println("Congratulation " + name + ", you have succesfully openned account");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getNiff() {
		return niff;
	}
	
	public Date getDate() {
		return createdDate;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("New balance: " + balance + "$");
	}
	
	public void useCard(double amount) {
		if(balance < amount) {
			System.out.println("Insuficient balance. You are fucking poor!");
		} else {
			balance -= amount;
			System.out.println("balance after purchase: " + balance + "$");
		}
	}
	
	public void checkBalance() {
		System.out.println("Your balance: " + getBalance() + "$");
	}
	
	public void checkAccountInfo() {
		System.out.println("Name: " + getName() + "\nniff: " + getNiff() + "\nbalance: " + getBalance() + "$");
	}
}
