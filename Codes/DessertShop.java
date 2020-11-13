import java.util.*;

abstract class dessertItem{
	abstract void getCost();
}

class dessertType extends dessertItem{
	private long price; //price in default unit
	private String unit; //default units of price
	private long localunit; //converted price to local units
	private int count; //count of dessert in the inventory
	private String name; 
	void addDessert(String name, long price, String unit, int quantity){
		if(unit.toUpperCase()=="USD"){
			this.price = price;
			this.unit = "USD";
			this.localunit = price*60;
			this.count = quantity;
			this.name = name;
			System.out.println("\nAdded "+name+" To The Inventory");
		}
		else if(unit.toUpperCase()=="EUR"){
			this.price = price;
			this.unit = "EUR";
			this.localunit = price*70;
			this.count = quantity;
			this.name = name;
			System.out.println("\nAdded "+name+" To The Inventory");
		}
		else if(unit.toUpperCase()=="INR"){
			this.price = price;
			this.unit = "INR";
			this.localunit = price*1;
			this.count = quantity;
			this.name = name;
			System.out.println("\nAdded "+name+" To The Inventory");
		}
		else{
			System.out.println("\nDamn check your units bro");
		}
	}
	void buyDessert(int quantity){
		if(quantity>count){
			System.out.println("\nWe're All Out!");
		}
		else{
			this.count = this.count - quantity;
			System.out.println("\nYou just purchased "+quantity+""+name+" for INR "+localunit+", i.e : "+unit+" "+price+".");
		}
	}
	void getCost(){
		if(this.count!=0){
			System.out.println("\n"+name+" are available for INR "+localunit+", i.e : "+unit+" "+price+".");
		}
		else{
			System.out.println("\n"+name+" are OUT OF STOCK, price is INR "+localunit+", i.e : "+unit+" "+price+".");
		}
	}
}

public class DessertShop{
	public static void main(String args[]){
		System.out.println("Are You a 1.Customer or 2. Owner? Press '0' to exit : ");
		Scanner sc = new Scanner(System.in);
		int selection = 2;
		do{
		selection = sc.nextInt();
		if(selection==1){
			dessertType candy = new dessertType();
			dessertType ice_cream = new dessertType();
			dessertType cookie = new dessertType();
			
			//Consider The Following Code Was Already Processed By The Owner
			
			candy.addDessert("candy", 5, "USD", 5);
			ice_cream.addDessert("ice cream", 15, "INR", 10);
			cookie.addDessert("cookie", 4, "EUR", 5);
			
			//USER CODE AGAIN
			
			candy.getCost();
			candy.buyDessert(5);
			candy.getCost();
		}
		else if(selection==2){
			dessertType candy = new dessertType();
			dessertType ice_cream = new dessertType();
			dessertType cookie = new dessertType();
			candy.addDessert("candy", 5, "USD", 5);
			ice_cream.addDessert("ice cream", 15, "INR", 10);
			cookie.addDessert("cookie", 4, "EUR", 5);
			cookie.getCost();
			candy.getCost();
			ice_cream.getCost();
			candy.getCost();
		}
		else{
			System.out.println("\nRe-Execute the code, either pass argument as '1' for Customer or '2' for Owner...'0' to exit ");
		}
		}while(selection!=0);
	}
}


/*OUTPUT


D:\Source Codes\Capgemini-Practs\JEEFS-React-Nov5-Batch-4\Java>java DessertShop
Are You a 1.Customer or 2. Owner? Press '0' to exit :
2

Added candy To The Inventory

Added ice cream To The Inventory

Added cookie To The Inventory

cookie are available for INR 280, i.e : EUR 4.

candy are available for INR 300, i.e : USD 5.

ice cream are available for INR 15, i.e : INR 15.

candy are available for INR 300, i.e : USD 5.
1

Added candy To The Inventory

Added ice cream To The Inventory

Added cookie To The Inventory

candy are available for INR 300, i.e : USD 5.

You just purchased 5candy for INR 300, i.e : USD 5.

candy are OUT OF STOCK, price is INR 300, i.e : USD 5.




*/
