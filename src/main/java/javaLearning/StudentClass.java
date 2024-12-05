package javaLearning;

import java.util.ArrayList;
import java.util.Collections;

public class StudentClass {
	public static void main(String[] args) {
		// Sample HashMap with unsorted values
		ArrayList<Student> studentlist = addStudent();

		Collections.sort(studentlist, (a, b) -> a.RollNumber - b.RollNumber);

		for (int i = 0; i < studentlist.size(); i++)
			System.out.println("RollNumber is " + studentlist.get(i).RollNumber + " and Name is "
					+ studentlist.get(i).Name + " and Address is " + studentlist.get(i).Address);

		if (studentlist.get(2) == studentlist.get(3))
			System.out.println("Student are same");
		else
			System.out.println("Student are not same");
	}

	public static ArrayList<Student> addStudent() {
		Student student1 = new Student(10, "Aaradhya", "New Colony");
		Student student2 = new Student(8, "Vimal", "Sector 34");
		Student student3 = new Student(18, "Ritu", "Sidhauli");
		Student student4 = new Student(7, "Arav", "Rampur");
		Student student5 = new Student(15, "Adira", "Kamlapur");
		Student student6 = new Student(11, "Bhumik", "Atariya");
		Student student7 = new Student(21, "Zoee", "Bakshi Ka Talab");
		Student student8 = new Student(29, "Laranya", "Khairabad");
		Student student9 = new Student(19, "Mahi", "Z Maholi");

		ArrayList<Student> studentlist = new ArrayList<Student>();
		studentlist.add(student1);
		studentlist.add(student2);
		studentlist.add(student3);
		studentlist.add(student4);
		studentlist.add(student5);
		studentlist.add(student6);
		studentlist.add(student7);
		studentlist.add(student8);
		studentlist.add(student9);

		return studentlist;
	}
}

class Student {
	int RollNumber;
	String Name;
	String Address;

	Student(int RollNumber, String Name, String Address) {
		this.RollNumber = RollNumber;
		this.Name = Name;
		this.Address = Address;
	}

	public void studentinfo() {
		System.out.println("RollNumber is " + RollNumber + " Name is " + Name + " Address is " + Address);
	}
}