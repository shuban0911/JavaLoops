
public class ArrayDemo {

	public static void main(String[] args) {
		String names[] = new String[4];
		int[] numbers = new int[] {1,3,7,9};
		for(int i:numbers) {
			System.out.println(i);
		}
		names[0]= "Uma";
		names[1]= "Shuban";
		names[2]= "Uma";
		names[3]= "Uma";
	
		for(String name:names) {
			System.out.println(name);
		}
	}

}
