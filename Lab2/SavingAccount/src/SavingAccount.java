public class SavingAccount {

	public static void main(String args[]) {
		final Account account = new Account();

		Thread calvin = new Person(account, "Calvin");
		Thread han = new Person(account, "Han");

		// UPC scholarship prevents deadlocks
		new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(10000);
						System.out.println("==================");
						System.out.println("= Annual summary =");
						System.out.println("==================");
						System.out.println("Current balance: $" + account.getBalance());
						System.out.println("More money plz");
						account.deposit(10);
					} catch (InterruptedException e) {};
				}
			}
		}, "Scholarship").start();

		calvin.start(); han.start();
	}

}
