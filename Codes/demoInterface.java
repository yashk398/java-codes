interface printable{
	void print();
}

class Circle implements printable{
	public void print(){
		System.out.println("Circle has been printed");
		}
	}



class Employee implements printable{
	public void print(){
		System.out.println("Employee has been printed");
		}
	}


public class demoInterface{
	public static void main(String args[]){
		printable p[] = new printable[6];
		
		p[0] = new Employee();
		p[1] = new Employee();
		p[2] = new Employee();
		p[3] = new Circle();
		p[4] = new Circle();
		p[5] = new Circle();
		
		printAll(p);
	}
	static void printAll(printable p[]){
		for(int x = 0; x<6; x++){
			p[x].print();
		}
	}
	
}