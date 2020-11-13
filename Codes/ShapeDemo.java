abstract class Shape{
	abstract void draw();
}

class Point extends Shape{
	void draw(){
		System.out.println("Point has been drawn\n");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("Circle has been drawn\n");
	}
}

class Line extends Shape{
	void draw(){
		System.out.println("Line has been drawn\n");
	}
}

class Square extends Shape{
	void draw(){
		System.out.println("Square has been drawn\n");
	}
}

class Cube extends Shape{
	void draw(){
		System.out.println("Cube has been drawn\n");
	}
}

public class ShapeDemo{
	public static void main(String args[]){
		Shape s[] = new Shape[5];
		s[0] = new Point();
		s[1] = new Circle();
		s[2] = new Line();
		s[3] = new Square();
		s[4] = new Cube();
		
		for(int i=0;i<s.length;i++){
			s[i].draw();
		}
	}
}


/*
D:\Source Codes\Capgemini-Practs\JEEFS-React-Nov5-Batch-4\Java>java ShapeDemo

Point has been drawn

Circle has been drawn

Line has been drawn

Square has been drawn

Cube has been drawn
*/