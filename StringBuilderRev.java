
public class StringBuilderRev {

	public static void main(String[] args) {
		String name = "Shuban";
		
		StringBuilderRev stringRev = new StringBuilderRev();
		String revName = stringRev.reverseString(name);
		System.out.println(revName);
		
	}



	String reverseString(String s) {
		StringBuilder revName = new StringBuilder();
		for(int i= s.length()-1;i>=0;i--) {
			revName.append(s.charAt(i));
		}
		//System.out.println(revName);
		return revName.toString();
	}

}
