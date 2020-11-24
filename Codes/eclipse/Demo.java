interface inter{
	public void hello(String name);
}

class A implements inter{
	private int p = 1;
	int u = 10;
	public int q = 15;
	protected int t = 15;
	
	public void hello(String name) {
		System.out.print("Hello "+name);
	}
}

class B extends A{
	private int balance = 10000;
	
	public B(int x) {
		this.balance = x;
	}
	
	public void fetch(int amt) {
		if(balance>amt)
			System.out.println("OK");
		else 
			System.out.println("Error");
	}
}

class C extends B{
	public C(int x) {super(x);}
	public int q = 1;
}

public class Demo{
	public static void main(String args[]){
		B x = new B(1000000);
		A z = new C(1500000);
		A z1 = new A();
		z1.hello("ABC");
		System.out.println("Demo "+z.q);
		x.fetch(100000);
	}
}
