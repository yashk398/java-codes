class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(){
		System.out.println("You Have Insufficient Balance");
	}
}

class balance{
	private long bal;
	public balance(long amt){
		this.bal = amt;
	}
	
	public void withdraw(long amt){
		if(amt<=this.bal) {
			this.bal = this.bal - amt;
			System.out.println("Successfully Withdrew "+amt);
			
		}
		else {
			try {
				throw new InsufficientBalanceException();
			}
			catch(InsufficientBalanceException e) {
				System.out.println("Caught Exception....."+e);
			}
		}
	}
	
}

public class BalanceException{

	public static void main(String[] args) {
		balance b = new balance(15000);
		b.withdraw(10000);
		b.withdraw(10000);
		b.withdraw(10000);
		

	}

}
