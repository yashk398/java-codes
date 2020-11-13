import java.util.*;

class Employee{
	Scanner sc = new Scanner(System.in);
	private int id;
	private String name;
	private double salary;
	Employee(){
		System.out.print("\nEnter Employee ID:");
		this.id = sc.nextInt();
		System.out.print("\nEnter Employee Name:");
		this.name = sc.nextLine();
	}
	public double CalcSalary(){
		this.salary = 15000;
		System.out.println("\nHello "+this.name+", EMPID : "+this.id+".Your Base Salary is : "+salary+"\n______________________________\n");

		return this.salary;
	}
}

class Manager extends Employee{
	private double incentive;
	private int designation;
	private double salary;
	Manager(){
		sc.nextLine();
		System.out.print("\nEnter designation (3-5):");
		designation = sc.nextInt();
		System.out.print("\nEnter Incentive:");
		incentive = sc.nextDouble();
		System.out.println("\n______________________________\n");
	}
	public double CalcSalary(){
		super.CalcSalary();
		this.salary = 15000.0/2.0*((double)designation)+this.incentive;
		System.out.println("\nYour Salary as a Manager is : "+salary+"\n______________________________\n");
		return this.salary;
	}
}

class Labour extends Employee{
	private double overtime;
	private int workhours;
	private double salary;
	Labour(){
		sc.nextLine();
		System.out.print("\nEnter workhours (1-8):");
		workhours = sc.nextInt();
		System.out.print("\nEnter overtime (1-8):");
		overtime = sc.nextDouble();
		System.out.println("\n______________________________\n");
	}
	public double CalcSalary(){
		super.CalcSalary();
		this.salary = 15000.0/10.0*((double)workhours+this.overtime);
		System.out.println("\nYour Salary as a Labour is : "+salary+"\n______________________________\n");
		return this.salary;
	}
}

public class EmpSalary{
	public static void getTotalSal(double l1,double l2,double m1,double m2){
		double salary = l1+l2+m1+m2;
		System.out.println("The Total Salary Amount Is : "+salary);
	}
	public static void main(String args[]){
		Manager m1 = new Manager();
		
		Manager m2 = new Manager();
		
		Labour l1 = new Labour();
		
		Labour l2 = new Labour();

		getTotalSal(l1.CalcSalary(),l2.CalcSalary(),m1.CalcSalary(),m2.CalcSalary());

	}
}




/*
CODE'S OUTPUT

Enter Employee ID:1501

Enter Employee Name:ABC

Enter designation (3-5):5

Enter Incentive:5000

______________________________


Enter Employee ID:1502

Enter Employee Name:PQR

Enter designation (3-5):4

Enter Incentive:1500

______________________________


Enter Employee ID:501

Enter Employee Name:TRP

Enter workhours (1-8):8

Enter overtime (1-8):5

______________________________


Enter Employee ID:505

Enter Employee Name:CRTF

Enter workhours (1-8):5

Enter overtime (1-8):5

______________________________


Hello , EMPID : 501.Your Base Salary is : 15000.0
______________________________


Your Salary as a Labour is : 19500.0
______________________________


Hello , EMPID : 505.Your Base Salary is : 15000.0
______________________________


Your Salary as a Labour is : 15000.0
______________________________


Hello , EMPID : 1501.Your Base Salary is : 15000.0
______________________________


Your Salary as a Manager is : 42500.0
______________________________


Hello , EMPID : 1502.Your Base Salary is : 15000.0
______________________________


Your Salary as a Manager is : 31500.0
______________________________

The Total Salary Amount Is : 108500.0
*/