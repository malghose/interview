package interview;

public class CheckPolyndrome {
	public static void main(String[] args) {
		String scentence = "My mom language is malayalam";
		String[] words = scentence.split(" ");
		for(String word: words) {
			if(isPalindrome(word)) {
				System.out.println(word+ " Is paindrome");
			}
		}
				
	}
	
	
	public static boolean isPalindrome(String scentence) {
		int i1 = 0;
		int i2 = scentence.length()-1;
		while(i1 < i2) {
			if(scentence.charAt(i1) != scentence.charAt(i2)) {
				return false;
			}
			i1++;
			i2--;
		}
		return true;
	}

}
