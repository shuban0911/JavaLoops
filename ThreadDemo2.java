
public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("I'm in thread class");
				
			}
			
		});
		t1.start();
	}



	

}
