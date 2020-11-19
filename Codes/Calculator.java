import java.util.*;
import custom.Calc;


public class Calculator{
	public static void main(String args[]){
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Operand ");
		int a = sc.nextInt();
		System.out.println("Please Enter Second Operand ");
		int b = sc.nextInt();
		
		Calc obj = new Calc();
		obj.sum(a,b);
	}
}