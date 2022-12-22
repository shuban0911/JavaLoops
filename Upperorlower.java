import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Upperorlower {

	public static void main(String[] args) {
		int a= 5;
		int b=1;
		Upperorlower up = new Upperorlower();
		int c = up.add(a, b);
		System.out.println(c);
		System.out.println(a);
		
		Integer[] num = {4,7,1,0};
		Arrays.sort(num);
		for(Integer n:num) {
		System.out.println(n);
		}
	}
	
	private int add(int a,int b) {
		a=7;
		return a+b;
	}

}
