package strings;

public class UpperAndLower {

	public static void main(String[] args) {
		String name = "ShubanAndDhanvin";
		int uppercase =0;
		int lowercase = 0;
		int n = name.length();
		
		for(int i=0;i<n;i++) {
			char letter = name.charAt(i);
			if(letter>='A' && letter<='Z') {
				uppercase++;
			}
			if(letter>='a' && letter<='z') {
				lowercase++;
			}
		}
		System.out.println("Uppercase letters :"+uppercase);
		System.out.println("Lowercase letters :"+lowercase);
	}

}
