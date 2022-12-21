// singleton class allows only one object to be created 
//but it does not allow  more than one object for a class
// It is achieved by changing constructor into a private, so we
// can only use static method to create an object once.
package Training;

class ABC
{
    static ABC obj =null;
    private ABC(){}
    public static ABC getInstance()
    {
        if(obj==null)
            obj=new ABC();
        return obj;
    }
    void display()
    {
        System.out.println("I am Display");
    }
}


public class Singleton_class {

	public static void main(String[] args) {
		
		ABC o=ABC.getInstance();
        o.display();
        ABC q = ABC.getInstance();
        q.display();

	}

}
