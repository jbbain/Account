/*******************************************************************/
/*                                                                 */
/*Jared Bain										   Homework #4 */
/*CISC 3150										 November 13, 2014 */
/*																   */
/*******************************************************************/

import java.util.*;





public class Account 
{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	Date dateCreated = new Date();

	
	
	
	public Account()
	{
	}
	
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
	}
	
	//Accessor for Id
	public int getId()
	{
		return id;
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
	}
	
	public void deposit (double amount)
	{
		balance += amount;
	}
	
	
	
	
}
