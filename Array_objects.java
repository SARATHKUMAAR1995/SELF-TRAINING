package Training;

class Student {
	public int roll_no;
	public String name;

	Student(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}

	void print() {
		System.out.println("Name    : " + name);
		System.out.println("Roll No : " + roll_no);
		System.out.println("---------------------------------");
	}
}

public class Array_objects {

	public static void main(String[] args) {

		Student[] o = new Student[5];

		o[0] = new Student(10, "Hari");
		o[1] = new Student(20, "Samy");
		o[2] = new Student(30, "Raj");
		o[3] = new Student(40, "Krish");
		o[4] = new Student(50, "Sankar");
		for (int i = 0; i < o.length; i++) {
			o[i].print();
		}

	}

}
