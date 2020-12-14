import java.util.*;


public class revArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(51);
		numbers.add(10);
		numbers.add(5);
		numbers.add(20);
		numbers.add(75);
		ArrayList<Integer> revArrayList = new ArrayList<Integer>(); 

		for (int i = numbers.size() - 1; i >= 0; i--){
            revArrayList.add(numbers.get(i)); 
        } 
		Iterator<Integer> itr = revArrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
