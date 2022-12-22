
public class ThreadDemo extends Thread{
	
	public void run() {
		System.out.println("I'm the thread running");
	}
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		t1.start();
		t2.start();
		
	
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		int threadCount = group.activeCount();
		
	   System.out.println(threadCount);
	}
	

}
