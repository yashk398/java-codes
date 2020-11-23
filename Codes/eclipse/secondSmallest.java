
import java.util.*;

class arrSort{
	int secondSmallestNumber;
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	public int getSecondSmallest(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arraylist.add(arr[i]);
		}
		Collections.sort(arraylist);
		return arraylist.get(1);
	}
}


public class secondSmallest {

	public static void main(String[] args) {
		int[] numbers = {15, 5, 20, 10, 3};
		arrSort list = new arrSort();
		System.out.println("The second smallest number is : "+list.getSecondSmallest(numbers));
		

	}

}
