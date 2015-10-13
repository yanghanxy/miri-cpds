public class SavingAccount {

	public static void main(String args[]) {
		Account account = new Account();

		Thread calvin = new Person(account, "Calvin");
		Thread han = new Person(account, "Han");

		calvin.start(); han.start();
	}

}
