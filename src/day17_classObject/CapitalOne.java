package day17_classObject;

public class CapitalOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount acc1=new BankAccount();

acc1.accountHolder="Mike Smith";
acc1.accountNumber=12345;
acc1.deposit(250);
acc1.showBalance();
acc1.withDraw(100);
acc1.showBalance();
acc1.charge(50, "table");
acc1.showBalance();
	}

}
