
public class StringRev {
	StringBuilder s1 = new StringBuilder();

	public static void main(String[] args) {
		String name = "Shuban";
		
		StringRev stringRev = new StringRev();
		stringRev.reverseString(name);
		
	}
	void reverseString(String s) {
		char letter[] = s.toCharArray();
		String revName="";
		for(int i= letter.length-1;i>=0;i--) {
			revName+=s.charAt(i);
		}
		s1.append(revName);
		System.out.println(s1);
	}

}
