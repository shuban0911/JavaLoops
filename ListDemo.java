import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> listNum = new ArrayList<Integer>();
		listNum.add(3);
		listNum.add(5);
		listNum.add(7);
		listNum.add(0);
		
		Iterator<Integer> it = listNum.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
