package privateaccessmodifier;

public class Bank {
	
	private String accountType1;
	private String accountType2;
	
	private void openAccount() {
		
		System.out.println("Account opened");
		accountType1 = "Savings";
		System.out.println(accountType1);
		depositMoney();
		
	}
	
	private void depositMoney() {
		
		System.out.println("Money deposited");
		
	}

}
