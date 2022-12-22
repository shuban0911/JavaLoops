import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Student,String> map = new HashMap<Student,String>();
		
		Set<Student> students = new TreeSet<Student>();
		
		students.add(new Student(1,"Shuban"));
		students.add(new Student(2,"Dhanvin"));
		students.add(new Student(3,"Ganesh"));
		students.add(new Student(2,"Shuban"));
		
		for(Student s: students) {
			System.out.println(s.getNo()+" : "+s.getName());
		}
		
		
		
		/*
		 * map.put(new Student(1,"Shuban"), "USA"); map.put(new Student(2,"Dhanvin"),
		 * "India"); map.put(new Student(3,"Ganesh"), "Vellore"); map.put(new
		 * Student(1,"Shuban"),"Ohio");
		 * 
		 * Set<Student> keySet = map.keySet(); for(Student s : keySet) {
		 * System.out.println(map.get(s)); }
		 */
		
		
		
	}

}

class Student implements Comparable<Student>{
	
	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}

	private int no;
	private String name;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Student(int no,String name){
		this.no = no;
		this.name = name;
	}
	
	

	@Override
	public int compareTo(Student o) {
		
		if(this.getNo()>o.getNo())
			return 1;
		else if(this.getNo()<o.getNo())
			return -1;
		else
		return 0;
	}
	
}
