
public class Circle extends Shape{
	
	Circle(){
		System.out.println("Circle constructor called");
	}

	public static void main(String[] args) {
		Shape s = new Circle();
		s.length();
	}

	@Override
	void length() {
		System.out.println("In the Circle Class");
	}

	
}
