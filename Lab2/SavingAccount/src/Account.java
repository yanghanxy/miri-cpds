public class Account {
	
	int balance = 0;

	public Account() {
	}

	public synchronized void deposit(int amount) throws InterruptedException {
		//TODO +
		balance += amount;
		System.out.println("Deposit " + amount +" in account, now the balance is " + balance);
		notifyAll();
	}

	public synchronized void withdraw(int amount) throws InterruptedException {
		//TODO -
		if(amount > balance) {
			System.out.println("No enough balance in account for withdraw " + amount);
		} else {
			balance -= amount;
			System.out.println("Withdraw " + amount +" in account, now the balance is " + balance);			
		}
	}
}
