
public class StaticPractice {
	
	public StaticPractice() {
		super();
		myId++;
	}

	private int id;
	private String name;
	
	static int myId;
	

	public static void main(String[] args) {
		StaticPractice staticPractice1 = new StaticPractice();
		StaticPractice staticPractice2 = new StaticPractice();
		StaticPractice staticPractice3 = new StaticPractice();
		System.out.println(myId);
		
	}

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

}
