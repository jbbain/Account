import java.util.ArrayList;
import java.util.Date;




public class newAccount {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	private String customerName;
	private ArrayList  transaction = new ArrayList();
	

	
	
	public newAccount(String customerName, int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		this.customerName = customerName;
		this.dateCreated = new Date();
	}
	
	//Accessor for transaction
	public ArrayList <Transaction>getTransaction(){
		return transaction;
	}
	
	//Accessor for customer name
	public String getName(){
		return customerName;
	}
	
		//Accessor for Id
	public int getId()
	{
		return this.id;
	}
	
	//Accessor for Balance
	public double getBalance()
	{
		return balance;
	}
	
	//Accessor for Annual interest rate
	public double getannualInterestRate()
	{
		return annualInterestRate;
	}
	
	//Accessor for Date
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	
	
	
	
	
	
	//Mutator for id
	public void setId(int id)
	{
		this.id= id;
	}
	
	//Mutator for Balance
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	//Mutator for Annual interest rate
	public void setAnnualInterestRate (double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate/100;
	}
	
	
	
	
	
	

	//Method to return monthly interest rate
	public double getMonthlyInterestRate()
	{
		double monthlyInterestRate = annualInterestRate/12;
		return monthlyInterestRate;
				
	}
	
	//Method to return monthly interest
	public double getMonthlyInterest()
	{
		return balance * getMonthlyInterestRate();
	}
	
	//Method to withdraw money from account
	public void withdraw (double amount)
	{
		balance -= amount;
		transaction.add(new Transaction('W', amount, balance, "You have withdrawn"));
	}
	
	//Method to deposit money to account
	public void deposit (double amount)
	{
		balance += amount;
		transaction.add(new Transaction('D', amount, balance, "You have deposited"));
	}
	
	
	
	
	
	//Transaction Class
	class Transaction{
		private char type;
		private double amount;
		private double balance;
		private String description;
		private Date date;
		
		
		public Transaction(char type, double amount, double balance, String description){
			this.type = type;
			this.amount = amount;
			this.balance = balance;
			this.description = description; 
			date = new Date();
			
		}
		
		//Accessors
		public char getType(){
			return type;
		}
		
		public double getAmount(){
			return amount;
		}
		
		public double getBalance(){
			return balance;
		}
		
		public String getDescription(){
			return description;
		}
		
		public Date getDate(){
			return date;
		}
	}
	
}
