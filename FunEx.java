package interview;

public class FunEx implements Functional {
	public static void main(String[] args) {
		Functional stringProcessor = (String str) -> str.length();
		    String name = "Lambda";
		    int length = stringProcessor.StringLength(name);
		    System.out.println(length);
	}

	
	public int StringLength(String str) {
		return 0;
	}

}
