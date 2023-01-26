package interview;

public class ComparableExample implements Comparable<Object> {
	private String name;
	private int age;
	private double percentage;
	
	public ComparableExample(String n,int a,float per) {
		name = n;
		age = a;
		percentage = per;
	}
	public String getName() {return name;}
	public int getAge() {return age;}
	public double getPercentage() {return percentage;}
	
	public boolean equals(ComparableExample other) {
		return this.getPercentage()== other.getPercentage();
	}
	public int compareTo(Object temp) {
		ComparableExample other = (ComparableExample) temp;
		if(getPercentage() > other.getPercentage()) {
			return 1;
		}
		else if(getPercentage() < other.getPercentage()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public String toString() {
		return "(Name :: " + getName() + " Age :: "+ getAge() + "Percentage :: "+ getPercentage() +")"; 
	}

	

}
