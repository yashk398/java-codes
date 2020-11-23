import java.util.HashMap;

public class CharArrayList {
	HashMap<Character, Integer> count = new HashMap<Character, Integer>();
	public HashMap<Character, Integer> counter(char[] a){
		for(int i=0; i<a.length; i++) {
			if(count.get(a[i])!=null) {
				count.put(a[i], count.get(a[i])+1);
			}
			else {
				count.put(a[i], 1);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		char[] arr = {'a', 'l', 'l', 'c', 'o', 'o', 'l', 'n', 'o', 'w'};
		CharArrayList c = new CharArrayList();
		System.out.println(c.counter(arr));
		

	}

}
