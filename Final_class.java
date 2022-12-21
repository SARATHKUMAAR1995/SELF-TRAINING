// When a class is final it cannot be inherited(extends) 
// it can only be used in the main method
package Training;

final class finalClassDemo
{
    public void display()
    {
        System.out.println("I am Display");
    }
}

public class Final_class {

	public static void main(String[] args) {
		finalClassDemo o =new finalClassDemo();
        o.display();

	}

}
