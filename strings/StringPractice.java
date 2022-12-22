package strings;

public class StringPractice {

	public static void main(String[] args) {
		String name ="Shuban";
		String splitString = "This is my family";
		char[] nameList = {'d','h','a','n','v','i','n'};
		
		String list = new String(nameList);
		String list1 = new String("Dhanvin");
		System.out.println(list);
		System.out.println(list.charAt(3));
		System.out.println(list.concat("Manikandan"));
		System.out.println(list.contains("vin"));
		System.out.println(list.endsWith("van"));
		String[] s = splitString.split("\\s");
		for(String word:s) {
			System.out.println(word);
		}
	}

}
