import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> setOfWords = new TreeSet<>();
		setOfWords.add("Uma");
		setOfWords.add("Shuban");
		setOfWords.add(null);
		setOfWords.add(null);
		setOfWords.add("Dhanvin");
		Iterator<String> it = setOfWords.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
