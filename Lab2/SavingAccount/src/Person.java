public class Person extends Thread {

	public static float ratio = 0.7f; // withdraw vs. deposit

	private Account account;

	public Person(Account account, String name) {
		this.account = account;
		setName(name);
	}

	public void run() {
		while (true) {
			try {
				// Random behaviour
				sleep((int)(Math.random() * 1000));
				if (Math.random() < ratio) {
					// Withdraw
					int amount = (int)(10 * Math.random()) + 1;
					System.out.println(getName() + " wants to withdraw $" + amount);
					account.withdraw(amount);
				} else {
					// Deposit
					int amount = (int)(10 * Math.random()) + 1;
					System.out.println(getName() + " wants to deposit $" + amount);
					account.deposit(amount);
				}
			} catch(InterruptedException ex) {};	
		}
	}

}
