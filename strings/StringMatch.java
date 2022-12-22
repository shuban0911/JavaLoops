package strings;

public class StringMatch {

	public static void main(String[] args) {
		String name ="Shuban Dhanvin";
		//char nameArray = name.toCharArray();
		int n =name.length();
		int upper = 0;
		int lower = 0;
		for(int i=0;i<n;i++) {
			String letter = String.valueOf(name.charAt(i));
			if(letter.matches("[a-z]")) {
				lower++;
			}else if(letter.matches("[A-Z]"))
				upper++;
		}
		System.out.println("Uppercase:" + upper);
		System.out.println("Lowercase" + lower);
	}

}
