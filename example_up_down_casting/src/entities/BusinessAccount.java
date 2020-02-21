package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		balance -= amount;
	}
	
/*  A palavra super faz a chamada do método da superclasse, no caso faz
 *  o saque como conta normal e desconta mais do balanço  */
	@Override
	public final void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}