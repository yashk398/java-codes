public class StringDemo{
	public static void main(String args[]){
		String s1 = "ABC";
		String s2 = new String("ABC");
		if(s1==s2){
			System.out.println("== method returns True");
		}
		else{
			System.out.println("== method returns False");
		}
		if(s1.equals(s2)){
			System.out.println(".equals method returns True");
		}
		else{
			System.out.println(".equals method returns False");
		}
	}
}