// When a method in a class contains another class in it is called Local inner class.

package Training;

class Outercls
{
    void display()
    {
        class Inner
        {
            void innerDisplay()
            {
                System.out.println("Inner Display");
            }
        }
 
        Inner i =new Inner();
        i.innerDisplay();
    }
}

public class Class_local_inner_class {

	public static void main(String[] args) {
		
		Outercls o =new Outercls();
        o.display();

	}

}
