public class Person extends Thread {

	Account account;
	String name;

	public Person(Account account, String name) {
		this.account = account;
		this.name = name;
	}

	public void run() {
		while (true) {
			try {
				sleep((int)(200 * Math.random()));
				if (Math.random() < 0.5) {
					// Withdraw
					int amount = 1 + (int)(10 * Math.random());
					System.out.println(name + " wants to withdraw " + amount);
					account.withdraw(amount);
				} else {
					// Deposit
				}
			} catch(InterruptedException ex) {};	
		}
	}

}
