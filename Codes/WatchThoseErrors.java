abstract class Abs{
	abstract void ErrorMsg();
}

class Inherited extends Abs{
	void ErrorMsg(){
		System.out.println("Try Removing Function ErrorMsg(), You'll get a real Error Message then.");
	}
}

abstract class Abstr{
	void empty(){
	//Empty
		System.out.println("Empty Method Declared Inside an Abstract Class");
	}
}

public class WatchThoseErrors{
	public static void main(String args[]){
		/*Should not work*/
	//	Abs obj = new Abs();
		Inherited obj = new Inherited();
		obj.ErrorMsg();
	}
}