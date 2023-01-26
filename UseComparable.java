package interview;

public class UseComparable {
	public static void main(String[] args) {
		ComparableExample a = new ComparableExample("Milton",26,(float) 9.9);
		ComparableExample b = new ComparableExample("Sushma",25,(float) 9.2);
		System.out.println("Compare to Returns :: " + a.compareTo(b));
		int result = a.compareTo(b);
		
		if(result < 0)
			System.out.println(a.getName()+" Comes Before "+ b.getName());
		else if (result > 0)
			System.out.println(b.getName()+" Comes Before "+ a.getName());
		else
			System.out.println(a.getName()+" Equals to "+ b.getName());


		
		
		
		
		
	}


}
