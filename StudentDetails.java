import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDetails {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentDetails(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		List<StudentDetails> studentList = new ArrayList<StudentDetails>();
		
		StudentDetails s1 = new StudentDetails(2, "John");
		StudentDetails s2 = new StudentDetails(10, "Shuban");
		StudentDetails s3 = new StudentDetails(12, "Dhanvin");
		StudentDetails s4 = new StudentDetails(23, "Jill");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		StudentIdSortComparator compId = new StudentIdSortComparator();
		
		Collections.sort(studentList,compId);
		
		for(StudentDetails detail: studentList) {
			System.out.println(detail.getId()+": "+detail.getName());
		}
		
		
		
	}

}
