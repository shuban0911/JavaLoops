
public class StringReverse {

	public static void main(String[] args) {
		
		String word = "hello";
		
		StringReverse strRev = new StringReverse();
		String result = strRev.revString(word);
		System.out.println(result);
		
	}
	
	private String revString(String word) {
		String revWord ="";
		for(int i= word.length()-1;i>=0;i--) {
		revWord = revWord+word.charAt(i);
		}
		return revWord;
		
	}

}
