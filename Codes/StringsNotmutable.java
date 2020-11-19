public class StringsNotmutable{
	public static void alterString(String s){
		s = s + " is changing the string";
	}
	
	public static void alterString(StringBuffer s1){
		s1.append(" is changing the stringbuffer");
	}
	
	public static void main(String args[]){
		String s = "Someone";
		alterString(s);
		System.out.println(s);
		StringBuffer s1 = new StringBuffer("Someone");
		s1.append(" is changing the stringbuffer");
		System.out.println(s1);
	}
}