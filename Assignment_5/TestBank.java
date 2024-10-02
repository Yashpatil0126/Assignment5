package assignment5;

public class TestBank {

	public static void main(String[] args) {

		BankA bankA = new BankA(1000);
		BankB bankB = new BankB(1500);
		BankC bankC = new BankC(2000);

		System.out.println("Bank A balance: $" + bankA.getBalance());
		System.out.println("Bank A balance with interest: $" + bankA.applyInterest());

		System.out.println("Bank B balance: $" + bankB.getBalance());
		System.out.println("Bank B balance with interest: $" + bankB.applyInterest());

		System.out.println("Bank C balance: $" + bankC.getBalance());
		System.out.println("Bank C balance with interest: $" + bankC.applyInterest());
	}
}
