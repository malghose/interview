package interview;

public class FunctionalEx {
    public void saySomething(){  
        System.out.println("Hello");  
    }  
    public static void main(String[] args) {
    	FunctionalMethod m = new FunctionalEx()::saySomething;
    	m.what();
	}

}
