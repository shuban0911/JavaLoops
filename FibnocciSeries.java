import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		fibnocci(n);
		scan.close();

	}

	static void fibnocci(int n) {
		int n1=0,n2=1,n3;
		
		
			//System.out.println(n1);
		
			for(int count =1;count<=n;count++){
				System.out.println(n1);
				n3 = n1+n2;
			
			//System.out.println(n3);
			n1=n2;
			n2=n3;
			
		
		}
		
	}
}
