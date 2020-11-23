import java.util.HashMap;
import java.util.Scanner;

class getSquare{
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	public HashMap<Integer, Integer> Square(Integer[] arr, int len){
		for(int i=0; i<len; i++) {
			Integer a = arr[i];
			Integer b = arr[i]*arr[i];
			hm.put(a,b);
		}
		return hm;
		
	}
}


public class SquareMap {

	private static Scanner sc;

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		sc = new Scanner(System.in);
		Integer[] arr = new Integer[5];
		System.out.println("How many elements? ");
		int len = sc.nextInt();
		for(int i=0; i<len; i++) {
			System.out.println("Enter next element ");
			arr[i] = sc.nextInt();
		}
		
		
		getSquare s = new getSquare();
		hm = s.Square(arr, arr.length);
		System.out.println("Numbers and their squares are : "+hm);
	}

}
