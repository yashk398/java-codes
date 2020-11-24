import java.util.*;

class methodSort{
	
	public int[] sortThis(int[] arr){
		int len = (arr.length);
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		int[] sortedarray = new int[len];
		for(int i=0; i<arr.length; i++) {
			arrlist.add(arr[i]);
		}
		Collections.sort(arrlist);
		for(int i = 0; i < arrlist.size(); i++)
		{
			int temp = arrlist.get(i);
		    sortedarray[i] = temp;
		}
		
		return sortedarray;
	}
}

public class reverseAndSort {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Please enter a number ");
			arr[i] = sc.nextInt();
			StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
			s = s.reverse();
			arr[i] = Integer.parseInt(s.toString());
		}
		
		int len = (arr.length);
		int[] sortedarray = new int[len];
		methodSort s = new methodSort();	
		sortedarray = s.sortThis(arr);
		System.out.println("Here's your sorted reversed array - ");
		for(int i=0; i<arr.length; i++) {
			System.out.println((sortedarray[i]));
		}
		
	}

}
