import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MathTest {

	public static void main(String[] args) {
		
		String s ="aaabbbnnnsssss";
		char[] charArray = s.toCharArray();
		Map<Character,Integer> countMap = new HashMap<Character,Integer>();
		for(int i=0;i<charArray.length;i++) {
			int n;
			if(!(countMap.containsKey(new Character(charArray[i])))) {
				n=1;
				countMap.put(new Character(charArray[i]),n);
			}else {
				n = countMap.get(new Character(charArray[i]));
				n++;
	
				countMap.put(new Character(charArray[i]), n);
			}
		}
				/*Set<Character> set = countMap.keySet();
				for(Character c:set) {
					countMap.get(c);*/
					System.out.println(countMap.entrySet());
				
		//}
	}

}
