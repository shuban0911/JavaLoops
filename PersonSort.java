import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSort {

	public static void main(String[] args) {
		
		List<PersonInfo> personList = new ArrayList<PersonInfo>();
		PersonInfo p1 = new PersonInfo(11, "Shuban");
		PersonInfo p2 = new PersonInfo(8, "Dhanvin");
		PersonInfo p3 = new PersonInfo(5, "Ganesh");
		PersonInfo p4 = new PersonInfo(4, "Kumar");
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		
		Collections.sort(personList);
		
		for(PersonInfo p:personList)
			System.out.println(p.getId()+": "+p.getName());
		
		
		
	}

}
