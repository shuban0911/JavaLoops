package exception;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		int s =0;
		try {
		System.out.println("First line in try");
		if(s==0) {
			System.out.println("s is 0");
			int result = 5/s;
			System.out.println("last line in try");
		}
			
		}catch(Exception e) {
			System.out.println("Divide by 0 exception");
		}
		System.out.println("afetr the try block");
	}

}
