// When a method in a class contains abstract class or interface
// it is called anonymous inner class

package Training;

abstract class testDemo {
    abstract void display();
}
 
class outerDemo {
    public void outerDisplay() {
        testDemo o =new testDemo() {
            @Override
            public void display() {
                System.out.println("Test Display");
            }
        };
        o.display();
    }
}


public class Class_anonymous_inner_class {

	public static void main(String[] args) {
		
		outerDemo o =new outerDemo();
        o.outerDisplay();

	}

}
