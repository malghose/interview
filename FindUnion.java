package interview;

import java.util.HashSet;
import java.util.Set;

public class FindUnion {
	public static void main(String[] args) {
		int[] m = {22,1,55,40,34,20};
		int[] n = {10,22,40,34,9,0};
		printUnion(m,n);
	}
	static void printUnion(int m[], int n[]) {
		Set<Integer> k = new HashSet<>();
		for(int i = 0; i<m.length;i++) {
			k.add(m[i]);
		}
		for(int i=0; i<n.length;i++) {
			k.add(n[i]);
		}
		System.out.println("Union");
		System.out.println(k);
	}

}
