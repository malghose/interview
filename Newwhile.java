package interview;

public class Newwhile {
	public static void main(String[] args) {
		int[] a = {22,1088,99,12};
		int i = 0;
		int max = a[0];
		while(i<a.length) {
			if(max<a[i]) {
				max = a[i];
			}
			i++;
		}
		System.out.println(max);
	}

}
