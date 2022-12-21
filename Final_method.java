// final method cannot be override because
// its constant through out the class
package Training;

class Super
{
    public void display()
    {
        System.out.println("I am Super Display");
    }
    final void finalDisplay()
    {
        System.out.println("I am Super Final Display");
    }
}
class sub extends Super
{
	//Method overriding
    public void display()
    {
        System.out.println("I am Sub Display");
    }
}


public class Final_method {

	public static void main(String[] args) {
		
		 sub o =new sub();
	        o.display();
	        o.finalDisplay();

	}

}
