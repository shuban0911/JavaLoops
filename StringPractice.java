
public class StringPractice {

	public static void main(String[] args) {
		String name = "Shuban";
		name+=" ";
		name+="is my son";
		System.out.println(name);
		
		StringBuilder sbName = new StringBuilder("Dhanvin");
		sbName.append(" ").append("is my son");
		System.out.println(sbName.toString());
		System.out.printf("My name is %s :I'm %d" , "uma",40);
		
		
		String name1 ="Shuban ,Dhanvin , Ganesh";
		char[] chars =name1.toCharArray();
		for(char character:chars) {
			System.out.print(character);
		}
		System.out.println(name1.charAt(0));
		
		System.out.println(name1.substring(0, 6));
		System.out.println(name1.concat("Manikandan"));
		
		if(name1.contains("@")) {
			System.out.println("My sentence has the char");
		}
 		
	}

}
