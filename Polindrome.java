package interview;

public class Polindrome {
	public static void main(String[] args) {
		String name = "is language malayalam";
		String[] word = name.split(" ");
		for(String str: word) {
			if(isPolindrome(str)) {
				System.out.println(str);
			}
		}
		
	}
	public static boolean isPolindrome(String name) {
		int s = 0;
		int m = name.length()-1;
		while(s<m) {
			if(name.charAt(s) != name.charAt(m)) {
				return false;
			}
			s++;
			m--;
		}
		return true;
	}

}
