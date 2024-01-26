package entities;

public class Client {

	private String name;
	private int accountnumber;
	private double accountvalues;
	
	public static double TAX = 5.00;
	
	public Client(String name, int accountnumber) {
		this.name = name;
		this.accountnumber = accountnumber;
	}
	
	public Client(String name, int accountnumber, double accountvalues) {
		this.name = name;
		this.accountnumber = accountnumber;
		this.accountvalues = accountvalues;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAccountnumber() {
		return accountnumber;
	}
	
	public double getAccountvalues() {
		return accountvalues;
	}
	
	public void addValue(double accountvalues) { 
		this.accountvalues += accountvalues;
	}
	
	public void removeValue(double accountvalues) {
		this.accountvalues -= accountvalues + TAX;
	}
	
	public String toString() {
		return "Account " 
		+ accountnumber
		+ ", Holder: "
		+ name
		+", Balance: $ "
		+ accountvalues;
	}
	
	
	
}
