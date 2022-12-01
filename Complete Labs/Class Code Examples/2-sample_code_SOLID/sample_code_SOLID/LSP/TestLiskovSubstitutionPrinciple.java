// This example is inspired from this source:
// https://www.baeldung.com/java-liskov-substitution-principle

class BankingAppWithdrawalService {
    private WithdrawableAccount account;
 
    public BankingAppWithdrawalService(WithdrawableAccount account) {
        this.account = account;
    }
 
    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}


public class TestLiskovSubstitutionPrinciple {

	public static void main(String[] args){
		
		
		
		SavingsAccount savAcc = new SavingsAccount("111222", 1000.00);
		BankingAppWithdrawalService withdrawalService 
				= new BankingAppWithdrawalService(savAcc);
		
		withdrawalService.withdraw(500);
		
		
	}}

////FixedTermDepositAccount ftDepAcc = new FixedTermDepositAccount("222333", 3500.00);
//CheckingAccount checkAcc = new CheckingAccount("111333", 5000.00);

//withdrawalService.withdraw(340.00);
