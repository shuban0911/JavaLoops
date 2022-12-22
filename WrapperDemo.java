import java.util.Scanner;

public class WrapperDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		System.out.println("Enter an int");
		int n = sc.nextInt();
		
		System.out.println(s);
		
		//System.out.println(n);
		
		  if(n == Integer.parseInt(s)) { System.out.println("Good job"); }
		 
		
	}

}
