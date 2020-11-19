import stud.Stud;

public class MarksAccess{
	public static void main(String args[]){
		Stud s1 = new Stud(15, 90);
		Stud s2 = new Stud(10, 95);
		Stud s3 = new Stud(20, 97);
		s1.checkMarks();
		s2.checkMarks();
		s3.checkMarks();
	}
}