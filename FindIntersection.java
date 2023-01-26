package interview;


import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
	public static void main(String[] args) {
		int[] a = {22,10,67,88,34,60,21,9,6,4,2,1};
		int[] b = {10,1,5,7,88,22,67,0,99,101,2};
		printIntersection(a,b);
		
	}
	static void printIntersection(int a[], int b[]) {
		Set<Integer> m = new HashSet<>();
		for(int i = 0;i < a.length;i++) {
			m.add(a[i]);
			
		}
		for(int i = 0; i<b.length;i++) {
			if(m.contains(b[i])) {
				System.out.println(b[i]);
			}

		}

	}

}
