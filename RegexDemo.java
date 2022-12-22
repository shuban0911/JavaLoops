import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*; 

public class RegexDemo {
	
	StringBuilder  sb= new StringBuilder();
	
	
	public static void main(String[] args) {
		
		 String input = "ShubanDhanvin091121";

		    List<String> array1 = new ArrayList<String>();

		    Pattern pattern = Pattern.compile("([A-Z][a-z]*)([0-9]*)");
		    Matcher matcher = pattern.matcher(input);               
		    while(matcher.find()){
		    	String charSeq = matcher.group(1);
		    	RegexDemo stringRev = new RegexDemo();
				String name = stringRev.reverseString(charSeq);
		    	
		        array1.add(name);

		        String atomAmount = matcher.group(2);
			
		        array1.add(atomAmount);
		    }
		    System.out.println(array1);
	}
	String reverseString(String s) {
		int n =s.length();
		String revName="";
		for(int i= n-1;i>=0;i--) {
			revName+=s.charAt(i);
		}
		return revName;
}
}
	
	
		
	

	

