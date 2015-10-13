public class Banket {

	public static void main(String args[]) {
		Pot pot = new Pot(5);

		Thread a = new Savage(pot);
		a.setName("Alpha");
		Thread b = new Savage(pot);
		b.setName("Beta");
		Thread c = new Savage(pot);
		c.setName("Gamma");

		Thread x = new Cook(pot);
		x.setName("Cook");

		a.start();
		b.start();
		c.start();

		x.start();
	}
}
