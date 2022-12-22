
public class PersonInfo implements Comparable<PersonInfo>{
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

	public PersonInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(PersonInfo o) {
		
		if(this.id >o.id) return 1;
		else if(this.id<o.id) return -1;
		else return 0;
	}

	
	
}
