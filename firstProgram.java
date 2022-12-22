
public class firstProgram {
int a,b;
String name ;
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

	public static void main(String[] args) {	
		System.out.println("Hello World");
		firstProgram firstprogram = new firstProgram();
		firstprogram.setA(3);
		firstprogram.setB(5);
		firstprogram.setName("Addition");
		int sum = firstprogram.addIntegers(firstprogram);
		System.out.println(sum + " "+firstprogram.getName());
	}
	
	int addIntegers(firstProgram firstprogram){
		int c=1;
		int a = firstprogram.getA();
		int b = firstprogram.getB();
	
		return a+b+c;
		
	}

}
