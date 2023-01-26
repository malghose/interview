package interview;

public class SingletonLazyInitialization {
	  private static SingletonLazyInitialization instance;
	  public String string;
	  private SingletonLazyInitialization ()
	  {
	    string = "I am learning Java";
	  }
	  public static SingletonLazyInitialization getInstance()   
	  {
	    if (instance == null)
	    {
	      instance = new SingletonLazyInitialization ();
	    }
	    return instance;
	  }
	  public static void main(String args[])
	  {
	    SingletonLazyInitialization text = SingletonLazyInitialization .getInstance();
	    SingletonLazyInitialization te = SingletonLazyInitialization .getInstance();

	    System.out.println(text.string);
	    System.out.println(te.string);

	  }
}
