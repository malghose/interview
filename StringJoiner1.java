package interview;

import java.util.StringJoiner;

public class StringJoiner1 {
	public static void main(String[] args) {
		StringJoiner s1 =new StringJoiner(";","[" ,"]");
		s1.add("A").add("B").add("C").add("D");
		System.out.println(s1);
		
		StringJoiner s2 =new StringJoiner("-");
		s2.add("Is").add("from").add("English Language");
		System.out.println(s2);
		s1.merge(s2);
		System.out.println(s1);


	}

}
