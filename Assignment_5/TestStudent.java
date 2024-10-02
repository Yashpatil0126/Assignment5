package assignment5;

public class TestStudent {
	public static void main(String[] args) {

		Student[] students = new Student[10];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}

		students[0].setInfo("John", 18);
		students[1].setInfo("Alice", 19, "123 Elm Street");
		students[2].setInfo("Bob", 20);
		students[3].setInfo("Carol", 21, "456 Oak Avenue");
		students[4].setInfo("David", 22);
		students[5].setInfo("Eve", 23, "789 Maple Lane");
		students[6].setInfo("Frank", 24);
		students[7].setInfo("Grace", 25, "101 Pine Road");
		students[8].setInfo("Hank", 26);
		students[9].setInfo("Ivy", 27, "202 Birch Boulevard");

		for (Student student : students) {
			student.displayInfo();
		}
	}
}
