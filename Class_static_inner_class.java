// When a class contains another static class inside is called Nested inner class

package Training;

class OuterClass {
    static int x=10;
    int y=20;
    static class InnerClass
    {
        void display()
        {
        	// variable x should be static so it can be accessed inside static class
            System.out.println("X : "+x);
        }
    }
}


public class Class_static_inner_class {

	public static void main(String[] args) {
		
		OuterClass.InnerClass i =new OuterClass.InnerClass();
        i.display();

	}

}
