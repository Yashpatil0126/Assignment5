package assignment5;

public class Shape {

	public void printArea(int side) { // square
		int area = side * side;
		System.out.println("Area of the square: " + area);
	}

	public void printArea(int length, int breadth) { // rectangle
		int area = length * breadth;
		System.out.println("Area of the rectangle: " + area);
	}

	public void printPerimeter(int side) { // square
		int perimeter = 4 * side;
		System.out.println("Perimeter of the square: " + perimeter);
	}

	public void printPerimeter(int length, int breadth) { // rectangle
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of the rectangle: " + perimeter);
	}
}