
public class CharSequenceDemo {

	public static void main(String[] args) {
		String name = "Automation";
		String s1 = name.substring(0, 4);
		StringBuilder sb1 = new StringBuilder("JavaAotomation");
		
		//System.out.println(s1);
		
		CharSequence s2 = name.subSequence(0, 4);
		System.out.println(s2);
		System.out.println(stringTest(s1));
		
		System.out.println(stringTest(sb1));
		
		
				
	}
	
	static String stringTest(CharSequence charseq) {
		
		return charseq.subSequence(0,4).toString();
		
	}
	
	

}
