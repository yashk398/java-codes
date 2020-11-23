import java.util.*;

class HashSort{
	
	public HashSort(HashMap<Integer, String> h){
		
		//Conversion to List Arrays		
		
		Set<Integer> keySet = h.keySet();
		ArrayList<Integer> listOfKeys = new ArrayList<Integer>(keySet);
		Collection<String> values = h.values();
		ArrayList<String> listOfValues = new ArrayList<>(values);
		
//		System.out.println("The Keys of the Map are "
//                + listOfKeys); 
		Collections.sort(listOfValues);
		System.out.println("The Values of the Map, Converted to a List are "
                + listOfValues); 
		
		
/*		List<Map.Entry<Integer, String> > list = 
	               new LinkedList<Map.Entry<Integer, String> >(h.entrySet()); 
		 Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() { 
	            public int compare(Map.Entry<Integer, String> o1,  
	                               Map.Entry<Integer, String> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	     });
		 
		 System.out.println("The Values of the Map are "+ list); */

	}
}

public class CollectionsDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> Fruits = new HashMap<Integer, String>();
		Fruits.put(5, "Mango");
		Fruits.put(3, "Apple");
		Fruits.put(1, "Orange");
		Fruits.put(8, "Kiwi");
		Fruits.put(10, "Custard Apple");
		
		//Sort Method
		HashSort h = new HashSort(Fruits);
		System.out.println("String"+1+2);

	}

}
