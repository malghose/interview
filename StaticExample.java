package interview;

public class StaticExample {
	static int a = 10;
	int b = 10;
	public void Find() {
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		StaticExample s1 = new StaticExample();
		StaticExample s2 = new StaticExample();
		StaticExample s3 = new StaticExample();

		s1.Find();
		s1.Find();
		s1.Find();
		s2.Find();
		s2.Find();
		s3.Find();

	}

}
