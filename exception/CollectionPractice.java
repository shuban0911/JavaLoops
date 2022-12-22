package exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionPractice {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Shuban");
		names.add("Dhanvin");
		names.add("Ganesh");
		names.add("Kumar");
		
		List<String> newList = new ArrayList<>();
		newList.addAll(names);
		
		System.out.println(names);
		
		for(String name:names) {
			System.out.println(name);
		}
		 Iterator<String> iterator =newList.iterator();
		 while(iterator.hasNext()) {
			 System.out.println("From iterator newList"+iterator.next());
		 }
		 
		
	}

}
