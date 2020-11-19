package fact;

public class Faculty{
	private int marks;
	private int rollno;
	public void setMarks(int rno, int marks){
		this.marks = marks;
		this.rollno = rno;
	}
	public void getMarks(int rno){
		System.out.println("Marks Procured by Roll No : "+rno+" are : "+marks);
	}
}