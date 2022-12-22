
public class StaticDemo {
	
	static int a= 10;
	
	static{
		System.out.println("I'm in static block");
	}

	public static void main(String[] args) {
		System.out.println(a);
		
		a=a+2;
		System.out.println(a);
		StaticDemo demo = new StaticDemo();
		demo.display();
	}
	
	public void display() {
		System.out.println(a);
	}

}
