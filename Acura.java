
public class Acura extends Car{
	
	Acura(){
		System.out.println("I'm in Acura");
	}
	
	public void run() {
		System.out.println("I'm fast");
	}

	public static void main(String[] args) {
		
		Car a = new Acura();
		a.engine();
		((Acura)a).run();
		info();
		
	}

}
