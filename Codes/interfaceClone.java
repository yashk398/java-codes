interface Clonable{
	int Order();
}

class Order implements Cloneable{
	int id;
	public Order(){
		this.id = 20;
	}
	public Order(int n){
		this.id = n;
	}
	@Override
	public Object clone(){
		try{
			return super.clone();
		}
		catch(CloneNotSupportedException e){
			return null;
		}
	}
	
	public String toString(){
		return "" + this.id;
	}
}

class interfaceClone{
	public static void main(String args[]) throws Exception{
		Order o = new Order(40);
		Order o2 = (Order)o.clone();
		System.out.println("Order 2 : "+o2);
	}
}
