
public class UpperandLower {

	public static void main(String[] args) {
		String word = "ShubanAndDhanvin";
		int uppercount =0;
		int lowercount = 0;
		
		for(int i = 0;i<word.length();i++) {
			if(word.charAt(i)>= 'a' && word.charAt(i)<='z') {
				lowercount++;
				
			}else
				uppercount++;
		}
		
		System.out.println("UpperCount :"+uppercount);
		System.out.println("LowerCount :"+lowercount);
	}

}
