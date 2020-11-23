import java.util.HashMap;
import java.util.Map;

class Student{
	HashMap<String, String> medals = new HashMap<String, String>();
	protected String id;
	protected Integer marks;
	public HashMap<String, String> getStudent(HashMap<String, Integer> r){
		for (Map.Entry<String, Integer> e : r.entrySet()) {
			if(e.getValue()>=90) {
				medals.put(e.getKey(), "GOLD");
				
			}
			else if(e.getValue()>=80 && e.getValue()<90) {
				medals.put(e.getKey(), "SILVER");
				
			}
			else if(e.getValue()>=70 && e.getValue()<80) {
				medals.put(e.getKey(), "BRONZE");
				
			}
			else{
				medals.put(e.getKey(), "NA");
				
			}
		}
		return medals;
	}
}

public class StudentMedals {

	public static void main(String[] args) {
		HashMap<String, Integer> details = new HashMap<String, Integer>();
		HashMap<String, String> medals = new HashMap<String, String>();
		
		details.put("2016TFRM01", 85);
		details.put("2016TFRM02", 95);
		details.put("2016TFRM03", 75);
		details.put("2016TFRM04", 80);
		details.put("2016TFRM05", 90);
		
		Student r = new Student();
		medals = r.getStudent(details);
		System.out.println("Here is the list of students with their marks... "+details);
		System.out.println("Here is the list of medals... "+medals);

	}

}
