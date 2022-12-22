import java.util.Comparator;

public class StudentIdSortComparator implements Comparator<StudentDetails>{

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		
		if(o1.getId()>o2.getId())
			return -1;
		else if(o1.getId()<o2.getId())
			return 1;
		else
		return 0;
	}

}
