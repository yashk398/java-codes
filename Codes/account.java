import java.util.*;

public class account{
	double bal;
	public account(double bal){
		this.bal = bal;
	}
	public void deposit(double amt){
		bal += amt;
		System.out.println("\nSuccessfully deposited amount. Balance is Rs."+bal);
	}
	public void withdraw(double amt){
		if(bal<amt){
			System.out.println("\nYou mad bro? Not enough balance.");
		}
		else{
			bal -= amt;	
			System.out.println("\nYou just withdrew : Rs."+amt+"with balance, Rs. "+bal);
		}
		
	}
	
	public void displaybal(){
		System.out.println("\nYour current Balance is : ₹"+bal);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		account a = new account(150000);
		int ch = 1;
		int amt = 0;
		do{
			System.out.println("\n1. Balance\n2. Deposit \n3. Withdraw \n0.Exit\n");
			ch = sc.nextInt();
			switch(ch){
				case(1): a.displaybal();
						 break;
				case(2): System.out.println("\nAmount you want to Deposit? ");
						 amt = sc.nextInt();
						 a.deposit(amt);
						 break;
				case(3): System.out.println("\nAmount you want to Withdraw? ");
						 amt = sc.nextInt();
						 a.withdraw(amt);
						 break;
				case(0): System.out.println("\nThankyou for banking with us"); 
						 break;
				default: System.out.println("\nWrong Command. Enter Number Again ");
						 break;
			}
		}while(ch!=0);
		
	}
}