package interview;

public final class Sample {
	final int a = 20;
	public final void add() {
		System.out.println(a+10);
	}


public final static void main(String[] args) {
	Sample b = new Sample();
	System.out.println(b.a);
	b.add();
 }
}