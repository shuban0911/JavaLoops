import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Person implements Comparable<Person>{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	
}

public class ComapablePractice {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(6,"Shuban"));
		personList.add(new Person(0,"Dhanvin"));
		personList.add(new Person(3,"Ganesh"));
		personList.add(new Person(4,"Kumar"));
		Collections.sort(personList);
		
		ComapablePractice comapablePractice = new ComapablePractice();
		comapablePractice.showPeople(personList);
		}
	void showPeople(Collection<Person> personList){
		
		for(Person person:personList) {
			System.out.println("Id :"+person.id+";"+"name :"+person.name);
		}
		
	}

}
