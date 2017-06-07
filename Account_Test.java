
class Account_Test extends Account {

		
	public void main(String[] args) {
		Account account = new Account(1122, 20000);
		
		account.setId(1122);
		account.setBalance(20000);
		account.setAnnualInterestRate(4.5);
		
		account.withdraw(2500);
		account.deposit(3000);
		
		
		System.out.println("The account balance is " + account.getBalance());
		System.out.println("The monthly interest rate is " + account.getMonthlyInterestRate());
		System.out.println("Date accessed: " + account.dateCreated); 
	}

}

	