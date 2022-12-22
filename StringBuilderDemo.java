
public class StringBuilderDemo {

	public static void main(String[] args) {
		
	StringBuilder sb = new StringBuilder("Uma");
	System.out.println(sb);
	StringBuilderDemo demo = new StringBuilderDemo();
	
	sb = new StringBuilder("Shuban");
	System.out.println(sb);
	
	System.out.println(demo);
	
	}
	
	public String toString() {
		return "This is to the toString";
		
	}
}
