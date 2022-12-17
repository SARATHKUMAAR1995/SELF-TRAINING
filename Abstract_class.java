package Training;

abstract class Shape {
	abstract void draw();

	void message() {
		System.out.println("Message From Shape");
	}
}

class rectangleShape_ extends Shape {
	void draw() {
		System.out.println("Draw Rectangle Using Length & Breadth.");
	}
}

public class Abstract_class {

	public static void main(String[] args) {
		rectangleShape_ o = new rectangleShape_();
		o.draw();
		o.message();

	}

}
