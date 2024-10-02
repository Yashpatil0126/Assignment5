package assignment5;

public class TestShape {

	public static void main(String[] args) {
		Shape shape = new Shape();

		
		int squareSide = 5;
		shape.printArea(squareSide);
		shape.printPerimeter(squareSide);

		
		int length = 4;
		int breadth = 7;
		shape.printArea(length, breadth);
		shape.printPerimeter(length, breadth);
	}
}
