package strings;

public class ChildClass extends BaseClass{
	
	public ChildClass(String s) {
		System.out.println(s);
	}
	
	public void methodChild() {
		System.out.println("Child Class");
	}
	public static void main(String[] args) {
		ChildClass c = new ChildClass("ShubanDhanvin");
	}

}
