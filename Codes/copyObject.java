


class Date implements Cloneable{
	int day;
	long month;
	long year;
	public Date(){
		this.day = 01;
		this.month = 01;
		this.year = 1995;		
	}
	public Date(int day, long month, long year){
		this.day = day;
		this.month = month;
		this.year = year;		
	}
	
	public String printDate(){
		return (this.day+"/"+this.month+"/"+this.year);
	}
	
	@Override
	public Object clone(){
		try{
			return super.clone();
		}
		catch(CloneNotSupportedException e){
			System.out.println(e);
			return null;
		}
	}
}

class Employee implements Cloneable{
	int id;
	String name;
	long salary;
	Date dob;
	
	public Employee(int id, String name, long sal, Date d){
		this.id = id;
		this.name = name;
		this.salary = sal;
		this.dob = d;
	}
	
	public void getEmployee(){
		System.out.println("Emp Name : "+this.name+", ID : "+this.id+", salary : "+this.salary+", DOB : "+this.dob.printDate()+".");
	}
	
	@Override
	public Object clone(){
		try{
			return super.clone();
		}
		catch(CloneNotSupportedException e){
			System.out.println(e);
			return null;
		}
	}
}

public class copyObject{
	public static void main(String args[]) throws Exception{
		Date dob = new Date(15, 10, 1990);
		Employee e1 = new Employee(1501, "ABC", 150000, dob);
		Employee e2 = null;
		e2 = (Employee)e1.clone();
		e1.getEmployee();
		e2.getEmployee();
		if(e1.dob==e2.dob){
			System.out.println("This is a Shallow Copy.");
		}
		else{
			System.out.println("This is a Deep Copy.");
		}
		Employee e3 = (Employee)e1.clone();
		e3.dob = (Date)dob.clone();
		if(e1.dob==e3.dob){
			System.out.println("This is a Shallow Copy.");
		}
		else{
			System.out.println("This is a Deep Copy.");
		}
	}
}