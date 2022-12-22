package datatypes;

public class StringData {

	public static void main(String[] args) {
		double n = 12.4;
		
		String number = String.valueOf(n);
		System.out.println(number+"10");
		System.out.println(number.matches("[0-9.]+"));
		
	}

}
