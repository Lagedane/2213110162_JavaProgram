
public class ATMData {
	private String accountNumber;
	private String password;
	
	public ATMData(String accountNumber, String password) {
		this.accountNumber = accountNumber;
		this.password = password;
	}
	
	public String getId() {
		return this.accountNumber;
	}
	
	public String getPass() {
		return this.password;
	}
}
